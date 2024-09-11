package com.exemploprojeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemploprojeto2.entidades.Questao;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
}
