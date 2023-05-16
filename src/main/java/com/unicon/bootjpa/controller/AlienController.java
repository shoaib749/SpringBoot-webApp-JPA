package com.unicon.bootjpa.controller;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.unicon.bootjpa.dao.AlienRepo;
import com.unicon.bootjpa.model.Alien;

@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.print("Home");
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/aliens")
	public List<Alien> getAliens() {	
		return repo.findAll();
	}
	@PostMapping("/aliens")
	public List<Alien> addNewAlien(Alien alien){
		repo.save(alien);
		return repo.findAll();
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAliens(@PathVariable("aid")  int aid) {	
		return repo.findById(aid);
	}
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable("aid") int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "Deleted";
	}
	@PutMapping("/alien")
	public Alien updateAlien(@RequestBody Alien a) {
		repo.save(a);
		return a;
	}
}
