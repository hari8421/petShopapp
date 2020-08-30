package com.petApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petApp.domain.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity, Long>{

}
