package com.example.manytooneunidirectionalmapping.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class State {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="state_sequence")
    @SequenceGenerator(name="state_sequence", sequenceName="state_seq", allocationSize = 1)
    private int id;

    @Column(nullable = false)
    private String name;

}
