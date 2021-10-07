package com.TiendaWeb55;

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

import com.TiendaWeb55Dao.ClienteDao;
import com.TiendaWeb55Dao.UsuarioDao;
import com.TiendaWeb55Dto.ClienteVO;
import com.TiendaWeb55Dto.CredencialesVO;
import com.TiendaWeb55Dto.ProductoVO;

@Controller
public class ClienteController {

	@RequestMapping("/listarClientes")
	public ArrayList<ClienteVO> listar(Model model){
		ArrayList<ClienteVO> listacliente=new ArrayList<ClienteVO>();
		ClienteDao dao=new ClienteDao();
		listacliente=dao.listarPersona();
		
		return listacliente;
	}
	
	@RequestMapping("/consutarCliente")
	public ArrayList<ClienteVO> consultar(int id){
		ClienteDao dao=new ClienteDao();
		return dao.consultarPersona(id);
	}
	@RequestMapping("/registrarCliente")
	public void registrarCliente(ClienteVO cliente) {
		ClienteDao dao=new ClienteDao();
		dao.registrarPersona(cliente);
	}
	
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("credenciales", new CredencialesVO());
		return "/loginForm";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("credenciales") CredencialesVO cd) {
		UsuarioDao dao=new UsuarioDao();
		boolean validacion=dao.verificarAcceso(cd);//verdadero si existe -- falso si no existe
		
		if (validacion) {
			return "redirect:/register";
		}else {
			return "/loginForm";
		}
	}
	
	@GetMapping("/register")
	public String registrarCliente(Model model) {
		model.addAttribute("user", new ClienteVO());
		return "/register_form";
	}
	
	@PostMapping("/register")
	public String registerCliente(@ModelAttribute("user") ClienteVO user) {
		ClienteDao dao=new ClienteDao();
		dao.registrarPersona(user);
		return "register_success";
	}
	
	
	
}
