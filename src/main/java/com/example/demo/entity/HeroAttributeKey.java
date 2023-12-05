package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class HeroAttributeKey implements Serializable {
    @Column(name = "hero_id")
    private Integer heroId;
    @Column(name = "attribute_id")
    private Integer attributeId;

}
