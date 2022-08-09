package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	@PostMapping("/alien")
	@ResponseBody
	public Alien addAlien(@RequestBody Alien alien){
		repo.save(alien);
		return alien;
	}
	@GetMapping(path="/aliens")
	@ResponseBody	
	public List<Alien> getAliens(){
		return repo.findAll();
	}	
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAliens(@PathVariable int aid){
		return repo.findById(aid);
	}	
}
