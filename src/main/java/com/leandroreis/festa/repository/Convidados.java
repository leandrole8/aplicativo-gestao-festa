package com.leandroreis.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroreis.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
