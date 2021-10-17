package com.alten.gestiondessalles.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name="salle")
public class Salle {
	
	@Id
	private Long idSalle;
	

	private String nomSalle;
	
	
	private int capaciteSalle;
	
	
	
	private LocalTime dateReservation;
	
	
	private boolean reserved;
	
	@ManyToMany
    @JoinTable( name = "T_Salles_Materiels_Associations",
                joinColumns = @JoinColumn( name = "idSalle" ),
                inverseJoinColumns = @JoinColumn( name = "idMateriel" ) )
    private List<Materiel> materiels = new ArrayList<>();
	
	@ManyToMany
    @JoinTable( name = "T_Salles_MaterielsSup_Associations",
                joinColumns = @JoinColumn( name = "idSalle" ),
                inverseJoinColumns = @JoinColumn( name = "idMaterielSup" ) )
    private List<Materiel> materielsSup = new ArrayList<>();
	
	
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Salle(String nomSalle, int capaciteSalle,  LocalTime dateReservation,
			boolean reserved) {
		super();
		this.nomSalle = nomSalle;
		this.capaciteSalle = capaciteSalle;
		
		this.dateReservation = dateReservation;
		this.reserved = reserved;
	}
	
	



	public Salle(Long idSalle) {
		super();
		this.idSalle = idSalle;
	}



	public Long getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(Long idSalle) {
		this.idSalle = idSalle;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public int getCapaciteSalle() {
		return capaciteSalle;
	}

	public void setCapaciteSalle(int capaciteSalle) {
		this.capaciteSalle = capaciteSalle;
	}

	

	public LocalTime getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(LocalTime dateReservation) {
		this.dateReservation = dateReservation;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	

	public List<Materiel> getMateriels() {
		return materiels;
	}



	public void setMateriels(List<Materiel> materiels) {
		this.materiels = materiels;
	}



	public List<Materiel> getMaterielsSup() {
		return materielsSup;
	}



	public void setMaterielsSup(List<Materiel> materielsSup) {
		this.materielsSup = materielsSup;
	}



	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", capaciteSalle=" + capaciteSalle +  "]";
	}
	
	
	
	
	
	
	

}
