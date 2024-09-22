package com.ashupre.inventoryservice.service;

import com.ashupre.inventoryservice.model.Inventory;
import com.ashupre.inventoryservice.reposiroty.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        Optional<Inventory> optional = inventoryRepository.findBySkuCode(skuCode);
        return optional.isPresent();
    }
}
