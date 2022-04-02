package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.TrackDAO;
import model.TrackModel;

/**
 * Servlet implementation class TrackServlet
 */
@WebServlet("/TrackServlet")
public class TrackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	private Gson gson = null;
	
	private void sendAsJson(
			HttpServletResponse response, 
			Object obj) throws IOException {
			
			response.setContentType("application/json");	
			String res = gson.toJson(obj);		     
			PrintWriter out = response.getWriter();
			response.setHeader("Access-Control-Allow-Origin", "*");
			out.print(res);
			out.flush();
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In the servlet");
		TrackModel dataToBeSend = new TrackModel();
		final TrackDAO dao = new TrackDAO();
		
		String trackId = request.getParameter("trackid");
		
		dataToBeSend = dao.Track(trackId);
				
		gson = new Gson();

		sendAsJson(response, dataToBeSend);
		
	}

}
