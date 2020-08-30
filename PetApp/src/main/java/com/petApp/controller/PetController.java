package com.petApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petApp.domain.PetEntity;
import com.petApp.service.PetService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PetController {
	
	@Autowired
	PetService pService;
	private static final Logger logger=LoggerFactory.getLogger(PetController.class);
	@RequestMapping("/addPet")
	@PostMapping
	public ResponseEntity<PetEntity> addPet(@RequestBody  PetEntity petBody){
		
		logger.info("add pet started");
		PetEntity pentity=pService.addPet(petBody);
		return new ResponseEntity<PetEntity>(pentity,HttpStatus.CREATED);
		
	}
	@RequestMapping("/updatePet")
	@PutMapping
	public ResponseEntity<PetEntity> updatePet(@RequestBody @Valid PetEntity petBody){
		
		logger.info("updatePet pet started");
		PetEntity pentity=pService.updatePet(petBody);
		return new ResponseEntity<PetEntity>(pentity,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllPet")
	public ResponseEntity<List<PetEntity>> getAllPet(){
		
		logger.info("add pet started");
		List<PetEntity> pList=pService.getAllPet();
		return new ResponseEntity<List<PetEntity>>(pList,HttpStatus.OK);
		
	}
	
	@GetMapping("/getPetById/{petId}")
	public ResponseEntity<PetEntity> getPetById(@PathVariable("petId") String petId){
		
		logger.info("add pet started");
		PetEntity pList=pService.getPetById(Long.parseLong(petId));
		return new ResponseEntity<PetEntity>(pList,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletePet/{petId}")
	public ResponseEntity<String> deletePet(@PathVariable("petId") String petId){
		
		logger.info("add pet started");
		pService.deletePet(Long.parseLong(petId));
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
		
	}

}
