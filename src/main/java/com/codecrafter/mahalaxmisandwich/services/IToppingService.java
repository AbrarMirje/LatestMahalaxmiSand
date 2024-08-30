package com.codecrafter.mahalaxmisandwich.services;

import com.codecrafter.mahalaxmisandwich.entities.Topping;

import java.util.List;

public interface IToppingService {
    Topping addTopping(Topping topping);

    Topping getToppingById(Topping topping);

    List<Topping> getAllToppings();

    Topping deleteToppingById(Long toppingId);

    Topping updateTopping(Topping topping);
}