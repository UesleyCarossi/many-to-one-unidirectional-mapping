package com.example.manytooneunidirectionalmapping.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.manytooneunidirectionalmapping.demo.repository")
public class JpaConfig {

}