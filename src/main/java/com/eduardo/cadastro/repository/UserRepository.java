package com.eduardo.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.cadastro.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
