package com.TiendaWeb55Dao;

import java.sql.*;

import com.TiendaWeb55Dto.CredencialesVO;

public class UsuarioDao {
	
	public boolean verificarAcceso(CredencialesVO cd) {// retorna verdadero si existe
		Conexion conex=new Conexion();
		boolean flag=false;
		try {
			String query="SELECT * from tiendaweb.usuarios where usuario =? and password=?";
			PreparedStatement consulta=conex.getConnection().prepareStatement(query);
			consulta.setString(1, cd.getUser());
			consulta.setString(2, cd.getPass());
			ResultSet res=consulta.executeQuery();
			if (res.next()) {
				flag=true;
				System.out.println("Consulta OK");
			}else {
				flag=false;//no existe usuario
				System.out.println("No existe usuario");
			}
			res.close();
			consulta.close();
			conex.desconectar();
			
		} catch (Exception e) {
			System.out.println("Error de verificación --- "+e);
		}
		return flag;
	}
}
