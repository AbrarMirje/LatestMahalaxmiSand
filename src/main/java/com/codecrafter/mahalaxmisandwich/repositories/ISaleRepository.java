package com.codecrafter.mahalaxmisandwich.repositories;

import com.codecrafter.mahalaxmisandwich.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISaleRepository extends JpaRepository<Sale,Long> {

    @Query("SELECT s FROM Sale s WHERE s.paymentMode = 'CASH'")
    List<Sale> getCashSaleReports();
    @Query("SELECT s FROM Sale s WHERE s.paymentMode = 'UPI'")
    List<Sale> getUpiSaleReports();
}
