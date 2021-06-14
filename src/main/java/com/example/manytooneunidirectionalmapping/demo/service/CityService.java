package com.example.manytooneunidirectionalmapping.demo.service;

import com.example.manytooneunidirectionalmapping.demo.domain.City;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityService {
    public City save(City city);
    public List<City> findAll();
}