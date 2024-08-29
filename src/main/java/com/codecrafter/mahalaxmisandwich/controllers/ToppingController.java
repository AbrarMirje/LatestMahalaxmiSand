package com.codecrafter.mahalaxmisandwich.controllers;

import com.codecrafter.mahalaxmisandwich.entities.ApiResponseMessage;
import com.codecrafter.mahalaxmisandwich.entities.Topping;
import com.codecrafter.mahalaxmisandwich.services.IToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toppings")
@CrossOrigin("*")
public class ToppingController {

    @Autowired
    private IToppingService toppingService;

    // Creat topping
    @PostMapping("/add-topping")
    public ResponseEntity<Topping> addTopping(@RequestBody Topping topping){
        return ResponseEntity.ok(toppingService.addTopping(topping));
    }

    // Get Topping By id
    @PostMapping("/get-topping")
    public ResponseEntity<Topping> getToppingById(@RequestBody Topping topping){
        return ResponseEntity.ok(toppingService.getToppingById(topping));
    }

    // Get all toppings
    @GetMapping("/get-toppings")
    public ResponseEntity<?> getAllToppings(){
        return ResponseEntity.ok(toppingService.getAllToppings());
    }

    // Delete topping by id
    @DeleteMapping("delete-topping/toppingId")
    public ResponseEntity<?> deleteToppingById(@PathVariable("toppingId") Long toppingId){
        toppingService.deleteToppingById(toppingId);
        ApiResponseMessage toppingDeleted = ApiResponseMessage.builder()
                .message("Topping Deleted Successfully")
                .isSuccess(true)
                .status(HttpStatus.OK)
                .build();

        return new ResponseEntity<>(toppingDeleted, HttpStatus.OK);
    }

    // Update Topping
    @PatchMapping("/update-topping")
    public ResponseEntity<Topping> updateTopping(@RequestBody Topping topping){
        return ResponseEntity.ok(toppingService.updateTopping(topping));
    }

}