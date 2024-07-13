package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.order;
import com.example.demo.services.orderservices;

@RestController
@RequestMapping("/api/v1")
public class ordercontroller {
	@Autowired
	orderservices service;
	@PostMapping("/insert")
	public order insert(@RequestBody order o) {
		return service.insert(o);
	}
	@PostMapping("/insertall")
	public Iterable<order> insertall(@RequestBody List<order> o) {
		return  service.insertall(o);
	}
	@GetMapping("/getall")
	public List<order> getall(){
		return service.getall();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<order> getbyid(@PathVariable int id) {
		return service.getbyid(id);
	}
	@DeleteMapping("/detelebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		return service.deletebyid(id);
	}
	@PutMapping("/update")
	public order updatebyid(@RequestBody order o) {
		return service.update(o);
	}

}
