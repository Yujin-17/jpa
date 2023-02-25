package com.sparta.jpa.repository;

import com.sparta.jpa.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {


}
