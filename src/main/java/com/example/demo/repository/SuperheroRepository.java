package com.example.demo.repository;

import com.example.demo.entity.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {
}