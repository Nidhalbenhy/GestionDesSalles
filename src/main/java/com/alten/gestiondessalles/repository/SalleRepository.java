package com.alten.gestiondessalles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alten.gestiondessalles.model.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
