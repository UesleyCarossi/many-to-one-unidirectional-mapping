package com.example.manytooneunidirectionalmapping.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="city_sequence")
    @SequenceGenerator(name="city_sequence", sequenceName="city_seq", allocationSize = 1)
    private int id;

    @NonNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_state")
    private State state;

}
