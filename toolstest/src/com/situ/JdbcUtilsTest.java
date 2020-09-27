package com.situ;

import java.sql.Connection;
import java.sql.SQLException;

import cn.itcast.jdbc.JdbcUtils;

/**
 * 
 * @author Administrator JdbcUtils用来获取Connection 底层使用了C3p0连接池 还需要使用mysql驱动
 *
 */
public class JdbcUtilsTest {
	/**
	 * 底层使用了c3p0连接池 所以还要添加c3p0的配置文件
	 * 
	 * @throws SQLException
	 */
	public static void testGetConnection() throws SQLException {
		Connection con = JdbcUtils.getConnection();
		System.out.println(con);
		JdbcUtils.releaseConnection(con);
		System.out.println(con.isClosed());	
		System.out.println("jieshu");
	}

	public static void main(String[] args) {
		try {
			testGetConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
