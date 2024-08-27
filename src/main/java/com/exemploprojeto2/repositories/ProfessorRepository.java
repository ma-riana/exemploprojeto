package com.exemploprojeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploprojeto2.entidades.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}