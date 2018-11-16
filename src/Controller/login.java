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

import Model.LOGIN_DAO;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
		doCheck(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
		doCheck(request, response);
	}

	private void doCheck(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		RequestDispatcher rd=null;
		HttpSession ss= request.getSession();
		String action = request.getParameter("action");
		if(action.equals("dangky"))
		{
			String ip= request.getParameter("ipChecked");
			ss.setAttribute("host", ip);
			rd= request.getRequestDispatcher("redirectRegister");
			rd.forward(request, response);
		} 
		else if(action.equals("dangnhap")) {
			
			String s= (String)ss.getAttribute("username");
			if(s==null||s.equals("")) {  
				String ip= request.getParameter("ipChecked");
				ss.setAttribute("host", ip);
				String userName= request.getParameter("inputUserName");
				String passWord = request.getParameter("inputPassword");
				LOGIN_DAO check = null;
				try {
					check = new LOGIN_DAO(ss.getAttribute("host").toString());
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				try {
					if(check.checkUser(userName, passWord)) {  
						ss.setAttribute("username", userName);

						rd = request.getRequestDispatcher("WEB-INF/cpanel/quanly.jsp");
						rd.forward(request, response);
					}
					else{  
				        request.setAttribute("error", "Username hoặc password không đúng, vui lòng nhập lại");  
				        rd=request.getRequestDispatcher("WEB-INF/Login.jsp");  
				        rd.forward(request,response);  
				    }  
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				rd = request.getRequestDispatcher("WEB-INF/cpanel/quanly.jsp");
				rd.include(request, response);
			}
		}
		
	}
}
