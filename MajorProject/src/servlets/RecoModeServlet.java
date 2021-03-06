package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.RecoModeDAO;
import model.RecoModeModel;

/**
 * Servlet implementation class RecoModeServlet
 */
@WebServlet("/RecoModeServlet")
public class RecoModeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecoModeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		List<RecoModeModel> dataToBeSend = new ArrayList<RecoModeModel>();
		final RecoModeDAO dao = new RecoModeDAO();
		String state = request.getParameter("state");
		String board = request.getParameter("board");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String total = request.getParameter("total");
		dataToBeSend = dao.RecoMode(state,board,Integer.parseInt(from),
				Integer.parseInt(to), Double.parseDouble(total));
				
		gson = new Gson();

		sendAsJson(response, dataToBeSend);		
	}

}
