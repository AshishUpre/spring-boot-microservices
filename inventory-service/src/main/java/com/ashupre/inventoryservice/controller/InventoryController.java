package com.ashupre.inventoryservice.controller;

import com.ashupre.inventoryservice.dto.InventoryResponse;
import com.ashupre.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    /**
     * path variable ->
     *      format if multiple skucodes : localhost:8080/api/inventory/iphone_13,iphone_13_red
     *
     * request parameter ->
     *      format if multiple sku-codes : localhost:8080/api/inventory?skuCode=iphone_13&skuCode=iphone_13_red
     *
     * second format (request param) more readable.
     *
     * Have list of string to query about stock of multiple sku-codes at a time as a single order can have multiple
     * item => multiple sku-codes
     */
//    @GetMapping("/{sku-code}")
//    @ResponseStatus(HttpStatus.OK)
//    public boolean isInStock(@PathVariable("sku-code") String skuCode) {
//        return inventoryService.isInStock(skuCode);
//    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
