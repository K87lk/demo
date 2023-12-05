package com.example.demo.repository;

import com.example.demo.entity.Alignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlignmentRepository extends JpaRepository<Alignment, Integer> {
}