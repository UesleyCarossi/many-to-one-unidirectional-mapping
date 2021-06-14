package com.example.manytooneunidirectionalmapping.demo.service.impl;

import com.example.manytooneunidirectionalmapping.demo.domain.City;
import com.example.manytooneunidirectionalmapping.demo.repository.CityRepository;
import com.example.manytooneunidirectionalmapping.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    public City save(City city) {
        return cityRepository.save(city);
    }

    public List<City> findAll() {
        return StreamSupport
                .stream(cityRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

}