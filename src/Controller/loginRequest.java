package Controller;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

	public void catChuoi(String s,ArrayList<String> ds) {
		String[] split= s.split("\\s+");
		if(split.length==4) {
			System.out.println(split[1]+" "+split[3]);
			if(split[3].equals("static")) {
				return;
			}
			else {
				ds.add(split[1]);
			}
		}
	}
	private void sendDirect(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		ArrayList<InetAddress> dsInet= new ArrayList<>();
//		try {
//			dsInet=getIP();
//			dsIP ds= new dsIP();
//			ds.setDs(dsInet);
//			request.setAttribute("ip", ds);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		request.setCharacterEncoding("utf-8");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Login.jsp");
//		dispatcher.forward(request, response);
		ArrayList<String> ds = new ArrayList<>();
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec("arp -a");
		BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = null; 
	     try {
	        while ((line = input.readLine()) != null)
	        	catChuoi(line,ds);
	     } catch (IOException e) {
	            e.printStackTrace();
	     }
	     dsIP list= new dsIP();
	     list.setDs(ds);
	     request.setAttribute("ip", list);
	     request.setCharacterEncoding("utf-8");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Login.jsp");
			dispatcher.forward(request, response);
	}
//	public static ArrayList<InetAddress> getIP() throws Exception {
//		ArrayList<InetAddress> ds= new ArrayList<>();
//		String ip=test();
//		String[] split = ip.split("\\.");		
//		String ipBase=split[0]+"."+split[1]+"."+split[2]+".";
//		for(int i=1;i<255;i++) {
//			String ipTemp = ipBase+String.valueOf(i);
//			InetAddress address = InetAddress.getByName(ipTemp);
//			if(address.isReachable(20)) {
//				ds.add(address);
//			}
//		}
//		return ds;
//	}
//	public static String test() throws Exception {
//        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
//        
//        while (interfaces.hasMoreElements()) {
//            NetworkInterface networkInterface = interfaces.nextElement();
//            // drop inactive
//            if (!networkInterface.isUp())
//                continue;
//
//            // smth we can explore
//            Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
//            while(addresses.hasMoreElements()) {
//            		InetAddress addr = addresses.nextElement();
//                    if(addr.getHostAddress().contains("192.168.")) {
//                    	return addr.getHostAddress();
//                    }
//            }
//        }
//		return "Không có";
//    }
}
