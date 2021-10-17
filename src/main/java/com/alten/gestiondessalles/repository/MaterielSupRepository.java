package com.alten.gestiondessalles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alten.gestiondessalles.model.MaterielSuplementaire;

@Repository
public interface MaterielSupRepository extends JpaRepository<MaterielSuplementaire, Long> {

}
