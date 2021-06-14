package com.example.manytooneunidirectionalmapping.demo.repository;

import com.example.manytooneunidirectionalmapping.demo.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CityRepository extends CrudRepository<City, Serializable> { }
