package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.order;

public interface orderrepository extends CrudRepository<order, Integer> {

}
