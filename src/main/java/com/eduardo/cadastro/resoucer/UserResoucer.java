package com.eduardo.cadastro.resoucer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eduardo.cadastro.entites.User;
import com.eduardo.cadastro.service.UserService;

@Controller
public class UserResoucer {
	
	@Autowired
	private UserService service; 
	
	@RequestMapping(value="/cadastroUsuarios", method=RequestMethod.GET)
	public String form() {
		return "cadastro";
	}
	
	@RequestMapping(value="/cadastroUsuarios", method=RequestMethod.POST)
	public String form(User user) {
		service.addUser(user);		
		return "redirect:/cadastroUsuarios";
		 
	}
	
	@RequestMapping("/listaUsuarios")
	public ModelAndView listUser() {
		ModelAndView mv = service.findAll();
		return mv;
	}
}
