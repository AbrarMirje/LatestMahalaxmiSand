package com.codecrafter.mahalaxmisandwich.entities.dto.helper;

import com.codecrafter.mahalaxmisandwich.entities.Item;
import com.codecrafter.mahalaxmisandwich.entities.Topping;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleItemsHelper {
    private Item item;
    private List<Topping> toppings;
    private Integer saleQty;
}
