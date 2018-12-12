package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface Customer extends  JpaRepository<User, Integer> {

}


