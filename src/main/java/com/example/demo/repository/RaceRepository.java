package com.example.demo.repository;

import com.example.demo.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Integer> {
}