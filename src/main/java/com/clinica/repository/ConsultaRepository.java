package com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinica.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}
