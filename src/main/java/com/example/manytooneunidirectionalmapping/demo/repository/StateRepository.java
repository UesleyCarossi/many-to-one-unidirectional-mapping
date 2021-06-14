package com.example.manytooneunidirectionalmapping.demo.repository;

import com.example.manytooneunidirectionalmapping.demo.domain.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StateRepository extends CrudRepository<State, Serializable> { }
