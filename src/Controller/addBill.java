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
import Model.KHUYENMAI_DAO;

/**
 * Servlet implementation class addBill
 */
@WebServlet("/addBill")
public class addBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession ss= request.getSession();
		int MaKH = Integer.parseInt(request.getParameter("makh"));
		int SoTien = Integer.parseInt(request.getParameter("sotien"));
		String ThoiGian = request.getParameter("thoigian");
		HOADON_DAO hd = null;
		try {
			hd = new HOADON_DAO(ss.getAttribute("host").toString(),ss.getAttribute("username").toString(),ss.getAttribute("pass").toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			hd.themHoaDon(MaKH,SoTien,ThoiGian);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("redirectHoaDon");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
