package charachters;

import java.sql.*;

public class ConnectionToTheServer {
	public static volatile ConnectionToTheServer singleInstance=null;
	private static String username="something";
	private static String password="something";
	private static String url="url to connect to the database";
	
	private ConnectionToTheServer() {
		// TODO Auto-generated constructor stub
	}
	public ConnectionToTheServer getinstance() {
		if (singleInstance==null) {
			synchronized (ConnectionToTheServer.class) {
				return singleInstance= new ConnectionToTheServer();
			}
		}
		return singleInstance;
	}
	public Connection getConnection() {
		return null;
	}

}
