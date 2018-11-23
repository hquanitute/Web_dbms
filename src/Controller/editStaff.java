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

/**
 * Servlet implementation class editStaff
 */
@WebServlet("/editStaff")
public class editStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editStaff() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8"); 
		HttpSession ss= request.getSession();
		String s= (String)ss.getAttribute("username");
		if(s==null||s=="") {
	        RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/Login.jsp");  
	        rd.include(request,response); 
		}
		else {
			NHANVIEN_DAO nv = null;
			try {
				nv = new NHANVIEN_DAO(ss.getAttribute("host").toString(),ss.getAttribute("username").toString(),ss.getAttribute("pass").toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {				
				int ma=Integer.parseInt(request.getParameter("e_makh"));
				String ten = request.getParameter("e_FullName");
				int phonenumber=Integer.parseInt(request.getParameter("e_phonenumber"));
				int luong=Integer.parseInt(request.getParameter("e_luong"));
				int ngay=Integer.parseInt(request.getParameter("e_ngaycong"));
				String diachi=request.getParameter("e_address");
				
				nv.suaNhanVien(ma, ten, phonenumber, diachi, ngay, luong);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("redirectNhanVien");
			dispatcher.forward(request, response);
		}
	}

}
