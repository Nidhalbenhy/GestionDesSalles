package com.alten.gestiondessalles.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class MaterielSuplementaire {
	
	@Id
	private Long idMaterielSup;
	private String nomMaterielSup;
	private int nombreEquipementSup;
	
	
	@ManyToMany
	@JoinTable( name = "T_Salles_MaterielsSup_Associations",
	            joinColumns = @JoinColumn( name = "idMaterielSup" ),
	            inverseJoinColumns = @JoinColumn( name = "idSalle" ) )
	    private List<Salle> salles = new ArrayList<>();
	
	
	public Long getIdMaterielSup() {
		return idMaterielSup;
	}
	public void setIdMaterielSup(Long idMaterielSup) {
		this.idMaterielSup = idMaterielSup;
	}
	public String getNomMaterielSup() {
		return nomMaterielSup;
	}
	public void setNomMaterielSup(String nomMaterielSup) {
		this.nomMaterielSup = nomMaterielSup;
	}
	public int getNombreEquipements() {
		return nombreEquipementSup;
	}
	public void setNombreEquipements(int nombreEquipements) {
		this.nombreEquipementSup = nombreEquipements;
	}
	public MaterielSuplementaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaterielSuplementaire(String nomMaterielSup, int nombreEquipements) {
		super();
		this.nomMaterielSup = nomMaterielSup;
		this.nombreEquipementSup = nombreEquipements;
	}
	@Override
	public String toString() {
		return "MaterielSuplementaire [idMaterielSup=" + idMaterielSup + ", nomMaterielSup=" + nomMaterielSup
				+ ", nombreEquipements=" + nombreEquipementSup + "]";
	}
	
	

}
