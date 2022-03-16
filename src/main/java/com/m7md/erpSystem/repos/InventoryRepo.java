package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {
}
