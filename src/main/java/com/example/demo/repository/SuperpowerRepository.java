package com.example.demo.repository;

import com.example.demo.entity.Superpower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperpowerRepository extends JpaRepository<Superpower, Integer> {
}