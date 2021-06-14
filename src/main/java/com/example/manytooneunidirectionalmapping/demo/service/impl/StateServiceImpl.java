package com.example.manytooneunidirectionalmapping.demo.service.impl;

import com.example.manytooneunidirectionalmapping.demo.domain.State;
import com.example.manytooneunidirectionalmapping.demo.repository.StateRepository;
import com.example.manytooneunidirectionalmapping.demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    public State save(State state) {
        return stateRepository.save(state);
    }

}