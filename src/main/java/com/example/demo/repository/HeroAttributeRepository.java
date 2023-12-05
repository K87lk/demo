package com.example.demo.repository;

import com.example.demo.entity.HeroAttribute;
import com.example.demo.entity.HeroAttributeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroAttributeRepository extends JpaRepository<HeroAttribute, HeroAttributeKey> {
}