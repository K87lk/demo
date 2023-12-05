package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "superhero", schema = "superhero")
public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "superhero_name")
    private String superheroName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    private Gender genderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eye_colour_id")
    private Colour eyeColour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hair_colour_id")
    private Colour hairColour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skin_colour_id")
    private Colour skinColour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alignment_id")
    private Alignment alignment;

    @Column(name = "height_cm")
    private Integer height;

    @Column(name = "weight_kg")
    private Integer weight;
    @ManyToMany
    @JoinTable(name = "hero_power", schema = "superhero" ,
            joinColumns = @JoinColumn(name = "hero_id"),
            inverseJoinColumns = @JoinColumn(name = "power_id"))
    private List<Superpower> superpowers;

}
