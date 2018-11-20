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

/**
 * Servlet implementation class addCustomer
 */
@WebServlet("/addCustomer")
public class addCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCustomer() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession ss= request.getSession();
		String ip=(String) ss.getAttribute("hostKhach");
		String username=request.getParameter("username");
		String inputPassword= request.getParameter("inputPassword");
		String email= request.getParameter("email");
		String address =request.getParameter("address");
		String ten = request.getParameter("FullName");
		int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		KHACHHANG_DAO kh=null;
		try {
			kh = new KHACHHANG_DAO(ip,"quan","quan");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			kh.themKhachHang(ten, phonenumber, address, email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("loginRequest");
		dispatcher.forward(request, response);
	}

}
