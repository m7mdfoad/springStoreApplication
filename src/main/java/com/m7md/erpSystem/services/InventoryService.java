package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.ProductNotFoundException;
import com.m7md.erpSystem.models.Inventory;
import com.m7md.erpSystem.repos.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private InventoryRepo inventoryRepo;

    @Autowired
    public InventoryService(InventoryRepo inventoryRepo) {
        super();
        this.inventoryRepo = inventoryRepo;
    }

    public Inventory addProduct(Inventory inventory) {
        return inventoryRepo.save(inventory);
    }

    public List<Inventory> findAllProducts() {
        return inventoryRepo.findAll();
    }

    public Inventory findProductById(long id) {
        return inventoryRepo.findById(id).orElseThrow(() -> new ProductNotFoundException("Product with id no: " + id + " is not found"));
    }

    public Inventory upgradeProduct(Inventory inventory) {
        return inventoryRepo.save(inventory);
    }

    public void deleteProduct(long id) {
        inventoryRepo.deleteById(id);
    }
}
