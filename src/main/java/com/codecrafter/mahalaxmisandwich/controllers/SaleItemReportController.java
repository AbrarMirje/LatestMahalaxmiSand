package com.codecrafter.mahalaxmisandwich.controllers;

import com.codecrafter.mahalaxmisandwich.services.ISaleItemReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
@CrossOrigin("*")
public class SaleItemReportController {

    @Autowired
    private ISaleItemReport saleItemReport;
    @GetMapping("/sale-reports")
    public ResponseEntity<?> getAllSaleReports(){
        return ResponseEntity.ok(saleItemReport.getAllSaleReports());
    }

    @GetMapping("/sale-cash-reports")
    public ResponseEntity<?> getCashSaleReports(){
        return ResponseEntity.ok(saleItemReport.getCashSaleReports());
    }
    @GetMapping("/sale-upi-reports")
    public ResponseEntity<?> getUpiSaleReports(){
        return ResponseEntity.ok(saleItemReport.getUpiSaleReports());
    }
}
