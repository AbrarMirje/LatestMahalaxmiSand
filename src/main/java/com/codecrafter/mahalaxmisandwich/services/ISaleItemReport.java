package com.codecrafter.mahalaxmisandwich.services;

import com.codecrafter.mahalaxmisandwich.entities.dto.SaleItemReport;

import java.util.List;

public interface ISaleItemReport {
    List<SaleItemReport> getAllSaleReports();
    List<SaleItemReport> getCashSaleReports();
    List<SaleItemReport> getUpiSaleReports();
}
