package com.example.demo.dto;

import com.example.demo.entity.Superpower;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperheroDto {
    private Integer id;
    private String superheroName;
    private GenderDto genderId;
    private ColourDto eyeColour;
    private ColourDto hairColour;
    private ColourDto skinColour;
    private RaceDto race;
    private PublisherDto publisher;
    private AlignmentDto alignment;
    private Integer height;
    private Integer weight;
}