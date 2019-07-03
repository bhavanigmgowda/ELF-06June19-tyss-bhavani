package com.tyss.jdbcapp.connectionpool;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import static com.tyss.jdbcapp.connectionpool.ConnectionPoolConst.*;

public class ConnectionPool {
	private Vector<Connection> pool ;
	private Connection con = null;
	private static ConnectionPool poolRef = null;
	private String userNM;
	private String password;
	private int poolSize;
	private String dbUrl;
	private String driverClassNM;

	public static ConnectionPool getConnectionPool() throws Exception {	
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;

	}
	private ConnectionPool() throws Exception {			//single ton
		loadPropert();
		initilize();

	}

	public Connection getConnectionFromPool() {
		return pool.remove(0);

	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
	
	
	private void loadPropert() throws IOException {
		userNM = PropertyUtil.getProperty().getProperty(ConnectionPoolConst.USERNM);
		password = PropertyUtil.getProperty().getProperty(ConnectionPoolConst.PASSWORD);
		poolSize = Integer.parseInt(PropertyUtil.getProperty().getProperty(ConnectionPoolConst.POOLSIZE));
		dbUrl = PropertyUtil.getProperty().getProperty(DBURL);
		driverClassNM = PropertyUtil.getProperty().getProperty(ConnectionPoolConst.DRIVERCLASSNM);

	}

	private void initilize() throws ClassNotFoundException, SQLException {
		pool= new Vector<>();
		Class.forName(driverClassNM);
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, userNM, password);
			pool.add(con);
		}
	}

}
