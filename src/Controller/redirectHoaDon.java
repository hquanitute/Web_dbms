package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.HOADON_DAO;
import Object.dsHoaDon;

/**
 * Servlet implementation class redirectHoaDon
 */
@WebServlet("/redirectHoaDon")
public class redirectHoaDon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirectHoaDon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
		HttpSession ss= request.getSession();
		String s= (String)ss.getAttribute("username");
		if(s==null||s=="") {
	        RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/Login.jsp");  
	        rd.forward(request,response); 
		}
		else {
			HOADON_DAO HD = null;
			try {
				HD = new HOADON_DAO(ss.getAttribute("host").toString(),ss.getAttribute("username").toString(),ss.getAttribute("pass").toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			dsHoaDon ds= new dsHoaDon();
			try {
				ds.setDs(HD.xemDSHoaDon());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("dsHD",ds );
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/cpanel/quanlyHoaDon.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
