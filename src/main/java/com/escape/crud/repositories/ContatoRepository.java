package com.escape.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escape.crud.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
