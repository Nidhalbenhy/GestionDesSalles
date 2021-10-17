package com.alten.gestiondessalles.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
public class Materiel {

	@Id
	private Long idMateriel;
	private String nomMateriel;
	private int nombreEquipements;
	
	@ManyToMany
	@JoinTable( name = "T_Salles_Materiels_Associations",
	            joinColumns = @JoinColumn( name = "idMateriel" ),
	            inverseJoinColumns = @JoinColumn( name = "idSalle" ) )
	    private List<Salle> users = new ArrayList<>();
	
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materiel( String nomMateriel, int nombreEquipements) {
		super();
		this.nomMateriel = nomMateriel;
		this.nombreEquipements = nombreEquipements;
	}

	public Long getIdMateriel() {
		return idMateriel;
	}

	public void setIdMateriel(Long idMateriel) {
		this.idMateriel = idMateriel;
	}

	public String getNomMateriel() {
		return nomMateriel;
	}

	public void setNomMateriel(String nomMateriel) {
		this.nomMateriel = nomMateriel;
	}

	public int getNombreEquipements() {
		return nombreEquipements;
	}

	public void setNombreEquipements(int nombreEquipements) {
		this.nombreEquipements = nombreEquipements;
	}

	@Override
	public String toString() {
		return "Materiel [idMateriel=" + idMateriel + ", nomMateriel=" + nomMateriel + ", nombreEquipements="
				+ nombreEquipements + "]";
	}
	
	
	
	
	
	
}
