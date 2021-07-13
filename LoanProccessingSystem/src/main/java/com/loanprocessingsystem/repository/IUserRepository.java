package com.loanprocessingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanprocessingsystem.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
