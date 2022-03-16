package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.Expenses;
import com.m7md.erpSystem.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
