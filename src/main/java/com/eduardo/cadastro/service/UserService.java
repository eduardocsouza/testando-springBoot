package com.eduardo.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.eduardo.cadastro.entites.User;
import com.eduardo.cadastro.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User addUser(User user) {
		return repository.save(user);
	}

	public ModelAndView findAll(){
		ModelAndView mv = new ModelAndView("index");
		List<User> users = repository.findAll();
		mv.addObject("user", users);
		return mv;
	}
}
