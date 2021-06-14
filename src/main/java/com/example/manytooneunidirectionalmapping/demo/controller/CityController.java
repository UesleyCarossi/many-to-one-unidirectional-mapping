package com.example.manytooneunidirectionalmapping.demo.controller;

import com.example.manytooneunidirectionalmapping.demo.domain.City;
import com.example.manytooneunidirectionalmapping.demo.domain.State;
import com.example.manytooneunidirectionalmapping.demo.service.CityService;
import com.example.manytooneunidirectionalmapping.demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<City> findAll() {
        return cityService.findAll();
    }

}