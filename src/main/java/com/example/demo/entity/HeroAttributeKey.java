package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class HeroAttributeKey implements Serializable {
    @Column(name = "hero_id")
    private Integer heroId;
    @Column(name = "attribute_id")
    private Integer attributeId;

}
