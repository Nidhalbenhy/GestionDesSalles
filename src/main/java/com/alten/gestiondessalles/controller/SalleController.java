package com.alten.gestiondessalles.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alten.gestiondessalles.model.Salle;
import com.alten.gestiondessalles.service.SalleService;

@Controller
@RequestMapping("/api")
public class SalleController {
	
	@Autowired
	private SalleService salleService;
	
	 @GetMapping("/salles")
	     public ResponseEntity<Salle> getSalle(
	            @RequestParam(value = "nombresPersonnes") int nombrePersonnes,
	            @RequestParam(value = "typeDereunion") String typeDereunion,
	            @RequestParam(value = "resourceDisponibles") List<String>RessourcesDisponible,
	            @RequestParam(value = "planning") LocalTime planning) {
		 
		 
		  return ResponseEntity.ok().body(salleService.findSalleByAttributs(nombrePersonnes, typeDereunion, RessourcesDisponible, planning));
	 }

	        // TODO...

	        

}
