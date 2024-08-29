package com.codecrafter.mahalaxmisandwich.services.impl;

import com.codecrafter.mahalaxmisandwich.entities.*;
import com.codecrafter.mahalaxmisandwich.entities.dto.SaleItems;
import com.codecrafter.mahalaxmisandwich.entities.dto.helper.SaleItemsHelper;
import com.codecrafter.mahalaxmisandwich.repositories.ISaleRepository;
import com.codecrafter.mahalaxmisandwich.services.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class SaleServiceImpl implements ISaleService {
    @Autowired
    private ISaleRepository saleRepository;

    @Override
    public SaleItems addSale(SaleItems saleItems) {


        Sale sale = new Sale();
        sale.setSubTotal(saleItems.getSubTotal());
        sale.setExtraCharges(saleItems.getExtraCharges());
        sale.setParcelCharges(saleItems.getParcelCharges());
        sale.setFinalTotal(saleItems.getFinalTotal());
        sale.setPaymentMode(saleItems.getPaymentMode().toUpperCase());
        sale.setItemSaleDate(LocalDate.now());
        sale.setItemSaleTime(LocalTime.now());

        List<SaleItem> saleItems2 = new ArrayList<>();
        List<SaleTopping> saleToppings = new ArrayList<>();


        for (SaleItemsHelper helper : saleItems.getSaleItemsHelpers()) {
            SaleItem saleItem = new SaleItem();
            saleItem.setSale(sale);
            saleItem.setItem(helper.getItem());
            saleItem.setQuantity(helper.getSaleQty());

            saleItems2.add(saleItem);

            for (Topping topping : helper.getToppings()) {
                SaleTopping saleTopping = new SaleTopping();
                saleTopping.setSale(sale);
                saleTopping.setTopping(topping);
                saleToppings.add(saleTopping);

                saleTopping.setItem(helper.getItem());
            }
        }

        sale.setSaleItems(saleItems2);
        sale.setSaleToppings(saleToppings);

        saleRepository.save(sale);

        return saleItems;
    }

}
