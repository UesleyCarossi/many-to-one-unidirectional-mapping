package com.example.manytooneunidirectionalmapping.demo.controller;

import com.example.manytooneunidirectionalmapping.demo.domain.State;
import com.example.manytooneunidirectionalmapping.demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public State save(@RequestBody State state) {
        return stateService.save(state);
    }

}