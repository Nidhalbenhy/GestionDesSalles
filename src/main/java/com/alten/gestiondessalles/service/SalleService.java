package com.alten.gestiondessalles.service;

import java.time.LocalTime;
import java.util.List;

import com.alten.gestiondessalles.model.Salle;

public interface SalleService
{

	public Salle findSalleByAttributs(int nombrePersonnes, String typeDereunion, List<String>RessourcesDisponible, LocalTime planning);
	
	
		      
		     
}
