package com.ava.sessaomobile.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ava.sessaomobile.model.SessaomobileModel;

public interface SessaomobileRepository extends JpaRepository <SessaomobileModel, Integer> {
	Optional<SessaomobileModel> findById(int id);

}
