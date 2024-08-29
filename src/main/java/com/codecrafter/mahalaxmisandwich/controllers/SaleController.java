package com.codecrafter.mahalaxmisandwich.controllers;

import com.codecrafter.mahalaxmisandwich.entities.dto.SaleItems;
import com.codecrafter.mahalaxmisandwich.services.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
@CrossOrigin("*")
public class SaleController {
    @Autowired
    private ISaleService saleService;

    @PostMapping("/add-sale")
    public ResponseEntity<?> addSale(@RequestBody SaleItems saleItems) {
        return ResponseEntity.ok(saleService.addSale(saleItems));
    }

}
