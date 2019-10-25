package onlineAd1;

import java.io.IOException;

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
 * Servlet implementation class inputservlet
 */
@WebServlet("/inputservlet.do")
public class inputservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inputservlet() {
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
		/*MongoCursor<Document> cursor = collection.find().iterator();
		while (cursor.hasNext()) {
			Document d = (Document) cursor.next();

			Book zip = new Book(d.getString("bname"), d.getString("aname"), d.getString("price"));
			dataList.add(zip);
		}
		request.setAttribute("data", dataList);
		request.getRequestDispatcher("view.jsp").forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MongoClient connection = ConnectionManager.getMongo();
		MongoDatabase db = ConnectionManager.getDb("advertise");

		MongoCollection<Document> collection = db.getCollection("onadvt");

		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String name = request.getParameter("name");
		Document document = new Document("email", email).append("phone", phone).append("name",name);
		collection.insertOne(document);
		
		response.sendRedirect("inputdata.jsp");
			}
	}


