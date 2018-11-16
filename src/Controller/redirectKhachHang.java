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

import Model.KHACHHANG_DAO;
import Object.dsKhachHang;

/**
 * Servlet implementation class redirectKhachHang
 */
@WebServlet("/redirectKhachHang")
public class redirectKhachHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirectKhachHang() {
        super();
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
	        rd.include(request,response); 
		}
		else {
			KHACHHANG_DAO kh = null;
			try {
				kh = new KHACHHANG_DAO(ss.getAttribute("host").toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			dsKhachHang ds= new dsKhachHang();
			try {
				ds.setDs(kh.xemDSKhachHang());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("dsKH",ds );
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/cpanel/quanlyKhachHang.jsp");
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
