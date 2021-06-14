package com.example.manytooneunidirectionalmapping.demo.service;

import com.example.manytooneunidirectionalmapping.demo.domain.State;
import org.springframework.stereotype.Component;

@Component
public interface StateService {
    public State save(State state);
}