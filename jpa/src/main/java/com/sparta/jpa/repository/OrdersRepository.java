package com.sparta.jpa.repository;

import com.sparta.jpa.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {


}
