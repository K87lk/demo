package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hero_attribute", schema = "superhero")
public class HeroAttribute {

    @EmbeddedId
    private HeroAttributeKey id;

    @ManyToOne
    @MapsId("heroId")
    @JoinColumn(name = "hero_id")
    private Superhero hero;

    @ManyToOne
    @MapsId("attributeId")
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    @Column(name = "attribute_value")
    private Integer attributeValue;

}
