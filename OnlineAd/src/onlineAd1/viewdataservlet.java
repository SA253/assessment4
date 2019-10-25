package onlineAd1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;


import onlineAd.Info;
import onlineAd.ConnectionManager;

/**
 * Servlet implementation class viewdataservlet
 */
@WebServlet("/viewdataservlet.do")
public class viewdataservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Info>dataList=new ArrayList<Info>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewdataservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("advertise");

		MongoCollection<Document> collection = db.getCollection("onadvt");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("advertise");

		MongoCollection<Document> collection = db.getCollection("onadvt");
		MongoCursor<Document> cursor = collection.find().iterator();
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			Info zip = new Info(d.getString("email"), d.getString("phone"), d.getString("name"));
			dataList.add(zip);
		}
		request.setAttribute("data", dataList);
		request.getRequestDispatcher("advertiser.jsp").forward(request, response);
	}
	}


