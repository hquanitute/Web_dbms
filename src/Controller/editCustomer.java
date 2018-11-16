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
 * Servlet implementation class editCustomer
 */
@WebServlet("/editCustomer")
public class editCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editCustomer() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
			KHACHHANG_DAO kh = null;
			try {
				kh = new KHACHHANG_DAO(ss.getAttribute("host").toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				int ma=Integer.parseInt(request.getParameter("e_makh"));
				String name=request.getParameter("e_fullName");
				int sdt=Integer.parseInt(request.getParameter("e_phonenumber"));
				String diachi=request.getParameter("e_address");
				String email=request.getParameter("e_email");
				kh.suaKhachHang(ma,name ,sdt ,diachi ,email );
			} catch (SQLException e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("redirectKhachHang");
			dispatcher.forward(request, response);
		}
	}

}
