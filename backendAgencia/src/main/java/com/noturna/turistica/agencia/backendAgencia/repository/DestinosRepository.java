package com.noturna.turistica.agencia.backendAgencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noturna.turistica.agencia.backendAgencia.model.Destinos;

@Repository
public interface DestinosRepository extends JpaRepository<Destinos, Long> {

}
