package com.info.step3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.step3.entity.Organization;

@Repository
public interface IOrganization extends JpaRepository<Organization, Long>  {

    
} 