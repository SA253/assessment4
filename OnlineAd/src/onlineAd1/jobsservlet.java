package onlineAd1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import onlineAd.ConnectionManager;
import onlineAd.Info;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
/**
 * Servlet implementation class jobsservlet
 */
@WebServlet("/jobsservlet")
public class jobsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jobsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Advertisements");
		MongoCollection<Document> collection = db.getCollection("jobAds");
		Document document = new Document("Job Title",request.getParameter("title"))
				.append("Description",request.getParameter("desc"))
				.append("Experience",request.getParameter("exp"))
				.append("Location",request.getParameter("loc"))
				.append("Contact",request.getParameter("ph"));
		collection.insertOne(document);
		response.sendRedirect("jobadd.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("Advertisements");
		MongoCollection<Document> collection = db.getCollection("jobAds");
		MongoCursor<Document> cursor = collection.find().iterator();
		
		List<Info> jobAds = new ArrayList<Info>();
		
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			Info j = new Info(d.getString("Job Title"), d.getString("Description"), d.getString("Experience"),d.getString("Location"), d.getString("Contact"));
			jobAds.add(j);
		}

		request.setAttribute("jobAds", jobAds);
		request.getRequestDispatcher("viewjob.jsp").forward(request, response);
		response.sendRedirect("viewjob.jsp");
	}

}
