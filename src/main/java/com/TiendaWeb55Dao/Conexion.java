package com.TiendaWeb55Dao;

import java.sql.*;

import javax.swing.JOptionPane;
public class Conexion {

	static String bd="tiendaweb";
	static String login="root";
	static String password="admin";
	static String url="jdbc:mysql://localhost:3306/"+bd;
	
	Connection connection_mia=null;
	
	
	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection_mia=DriverManager.getConnection(url,login,password);
			
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	
	public Connection getConnection() {
		
		return this.connection_mia;
	}
	public void desconectar() {
		connection_mia=null;
	}
	
}
