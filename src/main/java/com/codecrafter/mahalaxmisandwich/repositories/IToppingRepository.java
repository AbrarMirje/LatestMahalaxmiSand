package com.codecrafter.mahalaxmisandwich.repositories;

import com.codecrafter.mahalaxmisandwich.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToppingRepository extends JpaRepository<Topping,Long> {
}
