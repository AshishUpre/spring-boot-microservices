package com.ashupre.inventoryservice.service;

import com.ashupre.inventoryservice.dto.InventoryResponse;
import com.ashupre.inventoryservice.model.Inventory;
import com.ashupre.inventoryservice.reposiroty.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCodes) {
        return inventoryRepository.findBySkuCodeIn(skuCodes).stream()
                .map(Inventory ->
                        InventoryResponse.builder()
                            .skuCode(Inventory.getSkuCode())
                            .isInStock(Inventory.getQuantity() > 0)
                            .build()
                ).toList();
    }
}
