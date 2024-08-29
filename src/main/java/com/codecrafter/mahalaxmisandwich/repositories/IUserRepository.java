package com.codecrafter.mahalaxmisandwich.repositories;

import com.codecrafter.mahalaxmisandwich.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
