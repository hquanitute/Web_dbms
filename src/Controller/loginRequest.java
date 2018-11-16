package Controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Object.dsIP;

/**
 * Servlet implementation class loginRequest
 */

public class loginRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendDirect(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendDirect(request, response);
	}

	private void sendDirect(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<InetAddress> dsInet= new ArrayList<>();
		try {
			dsInet=getIP();
			dsIP ds= new dsIP();
			ds.setDs(dsInet);
			request.setAttribute("ip", ds);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Login.jsp");
		dispatcher.forward(request, response);
	}
	public static ArrayList<InetAddress> getIP() throws Exception {
		ArrayList<InetAddress> ds= new ArrayList<>();
		String ip=test();
		String ipBase=ip.substring(0, 12);
		for(int i=1;i<7;i++) {
			String ipTemp = ipBase+String.valueOf(i);
			InetAddress address = InetAddress.getByName(ipTemp);
			if(address.isReachable(1000)) {
				ds.add(address);
			}
		}
		return ds;
	}
	public static String test() throws Exception {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        
        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = interfaces.nextElement();
            // drop inactive
            if (!networkInterface.isUp())
                continue;

            // smth we can explore
            Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
            while(addresses.hasMoreElements()) {
            		InetAddress addr = addresses.nextElement();
                    if(addr.getHostAddress().contains("192.168.")) {
                    	return addr.getHostAddress();
                    }
            }
        }
		return "Không có";
    }
}
