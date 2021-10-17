package com.alten.gestiondessalles.service.impl;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alten.gestiondessalles.model.Materiel;
import com.alten.gestiondessalles.model.MaterielSuplementaire;
import com.alten.gestiondessalles.model.Salle;
import com.alten.gestiondessalles.repository.MaterielSupRepository;
import com.alten.gestiondessalles.repository.SalleRepository;
import com.alten.gestiondessalles.service.SalleService;

@Service
public class SalleServiceImpl implements SalleService {
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private MaterielSupRepository materielSuplementaireRepository;

	@Override
	public Salle findSalleByAttributs(int nombrePersonnes, String typeDereunion, List<String> RessourcesDisponible, LocalTime planning) {
		List <String> materiels = new ArrayList<>();
		List<Salle> salles = salleRepository.findAll();
		List<MaterielSuplementaire> materielSuplementaire = materielSuplementaireRepository.findAll();
		
		salles = salles.stream().filter
				(e -> e.getDateReservation()==null || (e.getDateReservation().compareTo(planning)>0
				&& e.getDateReservation().minusHours(1).compareTo(planning)>0 
				&& nombrePersonnes<=e.getCapaciteSalle()*(70/100)))
				.collect(Collectors.toList());
		if(typeDereunion.equals("CV")) {
			materiels = Arrays.asList("Ecran", "Pieuvre", "Webcam");
		}
		if(typeDereunion.equals("SPEC")) {
			materiels = Arrays.asList("Tableau");
		}
		if(typeDereunion.equals("RS")) {
			materiels = Arrays.asList("Néant");
		}
		if(typeDereunion.equals("RC")) {
			materiels = Arrays.asList("Tableau", "Ecran", "Pieuvre");
		}
		Long id = null ;
		for(String materiel: materiels) {
			
			for(Salle s :salles) {
				boolean test= false;
				boolean testSup= false;
				for(Materiel m : s.getMateriels()) {
					if(m.getNomMateriel().equals(materiel)) {
						test =true;
					}
					else {
						for(MaterielSuplementaire mSup : materielSuplementaire) {
							if(mSup.getNomMaterielSup().equals(materiel) && mSup.getNombreEquipements()>0) {
								id = mSup.getIdMaterielSup();
								testSup = true;
								
							}
						}
					}
					if(test==true) {
						s.setDateReservation(planning);
						s.setReserved(true);
						salleRepository.save(s);
						return s;
					}
					if(testSup==true) {
						s.setDateReservation(planning);
						s.setReserved(true);
						MaterielSuplementaire materielSup = materielSuplementaireRepository.findById(id).get();
						materielSup.setNombreEquipements(materielSup.getNombreEquipements()-1);
						materielSuplementaireRepository.save(materielSup);
						salleRepository.save(s);
						return s;
					}
				}
			}
		}
		return null;
	}

	

}
