package com.ipartek.formacion.uf2213;

import java.sql.*;

public class EjemploJDBC {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/manana_tienda";
		String USER = "root";
		String PASS = "1234";
		
		String SQL_SELECT = "SELECT * FROM clientes";
		
		Connection con = DriverManager.getConnection(URL, USER, PASS);		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQL_SELECT);
		
		while (rs.next()) {
			System.out.printf("%2s %s %-10s %s %s \n", 
					rs.getLong("id"),
					rs.getString("dni"),
					rs.getString("nombre"),
					rs.getString("apellidos").substring(0, 11),
					rs.getString("fecha_nacimiento")
					);
		}
	}

}
