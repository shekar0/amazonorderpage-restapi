package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.order;
import com.example.demo.repository.orderrepository;
@Service
public class orderservices {
	@Autowired
	orderrepository repo;
	public order insert(order o) {
		return repo.save(o);
	}
	public Iterable<order> insertall(List<order> o) {
		return repo.saveAll(o);
	}
	public List<order> getall()
	{
		return (List<order>) repo.findAll();
	}
	public Optional<order> getbyid(int id) {
		return repo.findById(id);
	}
	public String deletebyid(int id) {
		repo.deleteById(id);
		return "successfully deleted ";
	}
	public order update(order o) {
		int id=o.getId();
		order od=repo.findById(id).get();
		od.setOrderid(o.getOrderid());
		od.setName(o.getName());
		od.setAddress(o.getAddress());
		od.setAmount(o.getAmount());
		od.setEmail(o.getEmail());
		return repo.save(od);
	}

}
