package com.petApp.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petApp.domain.PetEntity;
import com.petApp.repository.PetRepository;
@Service
public class PetService {
	
	@Autowired
	PetRepository prepository;

	public PetEntity addPet(@Valid PetEntity petBody) {
		
		return prepository.save(petBody);
	}

	public List<PetEntity> getAllPet() {
		return prepository.findAll();
	}

	public PetEntity updatePet(@Valid PetEntity petBody) {
		return prepository.save(petBody);
	}

	public void deletePet(long petId) {
		 prepository.deleteById(petId);
		
	}

	public PetEntity getPetById(long parseLong) {
		return prepository.findById(parseLong).get();
	}

}
