package com.codecrafter.mahalaxmisandwich.entities;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponseMessage {
    private String message;
    private boolean isSuccess;
    private HttpStatus status;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public static class SaleItemsHelper {
        private Item item;
        private List<Topping> toppings;
    }
}