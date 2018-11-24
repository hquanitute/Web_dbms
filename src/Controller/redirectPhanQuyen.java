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

import Model.KHUYENMAI_DAO;
import Model.NHANVIEN_DAO;
import Model.PHANQUYEN_DAO;
import Object.dsKhuyenMai;
import Object.dsNhanVien;
import Object.dsPhanQuyen;

/**
 * Servlet implementation class redirectPhanQuyen
 */
@WebServlet("/redirectPhanQuyen")
public class redirectPhanQuyen extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirectPhanQuyen() {
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
			PHANQUYEN_DAO pq = null;
			try {
				pq = new PHANQUYEN_DAO(ss.getAttribute("host").toString(),ss.getAttribute("username").toString(),ss.getAttribute("pass").toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			dsPhanQuyen ds= new dsPhanQuyen();
			try {
				ds.setDs(pq.xemPhanQuyen());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("dsPQ",ds );
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/cpanel/quanlyPhanQuyen.jsp");
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
