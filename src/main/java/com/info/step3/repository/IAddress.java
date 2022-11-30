package com.info.step3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.step3.entity.Address;

public interface IAddress extends JpaRepository<Address, Long> {
    
}
