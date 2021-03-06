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
import Model.NHANVIEN_DAO;
import Object.dsKhachHang;
import Object.dsNhanVien;

/**
 * Servlet implementation class redirectNhanVien
 */
@WebServlet("/redirectNhanVien")
public class redirectNhanVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirectNhanVien() {
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
			NHANVIEN_DAO nv = null;
			try {
				nv = new NHANVIEN_DAO(ss.getAttribute("host").toString(),ss.getAttribute("username").toString(),ss.getAttribute("pass").toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			dsNhanVien ds= new dsNhanVien();
			try {
				ds.setDs(nv.xemDSNhanVien());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("dsNV",ds );
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/cpanel/quanlyNhanVien.jsp");
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
