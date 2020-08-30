package com.petApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petApp.domain.CustomerDtl;

public interface CustomerRepository extends JpaRepository<CustomerDtl, Long>{

}
