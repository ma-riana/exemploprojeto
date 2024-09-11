package com.exemploprojeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemploprojeto2.entidades.Formulario;

public interface FormularioRepository extends JpaRepository<Formulario, Long> {
}
