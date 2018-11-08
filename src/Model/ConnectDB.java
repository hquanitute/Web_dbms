package Model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;

public class ConnectDB 
{
	
	public ConnectDB() {
		super();
	}
	public ConnectDB(Connection conn) {
		super();
		this.conn = conn;
	}
	private Connection conn;
	public Connection Connect() throws ClassNotFoundException, ServletException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = null;
		try {
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
					   "databaseName=QUANLYSPA;user=quan;password=quan;";  
			conn = DriverManager.getConnection(connectionUrl);  

			return conn;
		}
		catch (Exception e) {
		}
		return conn;
	}
}
