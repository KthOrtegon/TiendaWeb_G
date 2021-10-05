package com.TiendaWeb_GDao;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.TiendaWeb_GDto.ClienteVO;
public class ClienteDao {

	
	public ArrayList<ClienteVO> listarPersona(){
		
		ArrayList<ClienteVO> listaClientes =new ArrayList<>();
		Conexion conex=new Conexion();
		
		try {
			String query="Select cedula_cliente,direccion_cliente,email_cliente, nombre_cliente, telefono_cliente from clientes;";
			PreparedStatement consulta =conex.getConnection().prepareStatement(query);
			ResultSet res=consulta.executeQuery();
			
			
			while(res.next()) {
				ClienteVO cliente=new ClienteVO();
				cliente.setCedula_cliente(res.getInt("cedula_cliente"));
				cliente.setDireccion_cliente(res.getString("direccion_cliente"));
				cliente.setEmail_cliente(res.getString("email_cliente"));
				cliente.setNombre_cliente(res.getString("nombre_cliente"));
				cliente.setTelefono_cliente(res.getString("telefono_cliente"));
				listaClientes.add(cliente);
			}
			res.close();
			consulta.close();
			conex.desconectar();
			
		} catch (Exception e) {
			
			System.out.println("Error listar ... "+e);
		}
		return listaClientes;
	}
	
	public ArrayList<ClienteVO> consultarPersona(int id){
		ArrayList<ClienteVO> listaClientes=new ArrayList<>();
		Conexion conex=new Conexion();
		try {
			String query="Select cedula_cliente,direccion_cliente,email_cliente, nombre_cliente, telefono_cliente from clientes where cedula_cliente=?";
			PreparedStatement consulta =conex.getConnection().prepareStatement(query);
			consulta.setInt(1, id);
			ResultSet res=consulta.executeQuery();
			if (res.next()) {
				ClienteVO cliente=new ClienteVO();
				cliente.setCedula_cliente(res.getInt("cedula_cliente"));
				cliente.setDireccion_cliente(res.getString("direccion_cliente"));
				cliente.setEmail_cliente(res.getString("email_cliente"));
				cliente.setNombre_cliente(res.getString("nombre_cliente"));
				cliente.setTelefono_cliente(res.getString("telefono_cliente"));
				listaClientes.add(cliente);
			}
			res.close();
			consulta.close();
			conex.desconectar();
			
			
		}catch (Exception e) {
			System.out.println("Error al consultar persona"+e);
			
		}
		return listaClientes;
	}
	
	public void registrarPersona(ClienteVO persona) {
		Conexion conex=new Conexion();
		try {
			Statement est=conex.getConnection().createStatement();
			String query="INSERT INTO tiendaweb (cedula_cliente,direccion_cliente,email_cliente, nombre_cliente, telefono_cliente)"
					+"values ("+persona.getCedula_cliente()+"','"+persona.getDireccion_cliente()+"'.'"+persona.getEmail_cliente()+"'.'"+persona.getNombre_cliente()+"'.'"+persona.getTelefono_cliente()+"')";
			est.executeUpdate(query);
			System.out.println("Registro correcto");
			est.close();
			conex.desconectar();
			
			
		}catch (Exception e) {
			System.out.println("Error registro"+e);
		
	}
}
	
	/*public boolean verificarAcceso(CredencialesVO cd) {// retorna verdadero si existe
		Conexion conex=new Conexion();
		boolean flag=false;
		try {
			String query="select user, pass from credenciales where user=? and pass=?";
			PreparedStatement consulta=conex.getConnection().prepareStatement(query);
			consulta.setString(1, cd.getUser());
			consulta.setString(2, cd.getPass());
			ResultSet res=consulta.executeQuery();
			if (res.next()) {
				flag=true;
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
	}*/
	
}


