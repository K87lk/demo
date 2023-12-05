package com.example.demo.dto;

import com.example.demo.entity.Attribute;
import com.example.demo.entity.HeroAttributeKey;
import com.example.demo.entity.Superhero;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeroAttributeDto {
    private HeroAttributeKey id;
    private Superhero heroId;
    private Attribute attributeId;
    private Integer attributeValue;
}