package com.TiendaWeb_G;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.TiendaWeb_GDao.ClienteDao;
import com.TiendaWeb_GDto.ClienteVO;
//import com.TiendaWeb55Dto.CredencialesVO;
//import com.TiendaWeb_GDto.ProductoVO;

@RestController
public class ClienteController {

	@RequestMapping("/listarClientes")
	public ArrayList<ClienteVO> listar(){
		ArrayList<ClienteVO> listacliente=new ArrayList<ClienteVO>();
		ClienteDao dao=new ClienteDao();
		listacliente=dao.listarPersona();
		
		return listacliente;
	}
	
	@RequestMapping("/consultarCliente")
	public ArrayList<ClienteVO> consultar(int id){
		ClienteDao dao=new ClienteDao();
		return dao.consultarPersona(id);
	}
}
