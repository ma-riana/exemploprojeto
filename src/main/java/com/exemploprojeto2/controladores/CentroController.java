
package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Centro;
import com.exemploprojeto2.repositories.CentroRepository;

@RestController
@RequestMapping(value = "/centros")
public class CentroController {

    @Autowired
    private CentroRepository repositorio;

    @GetMapping
    public List<Centro> findAll() {
        List<Centro> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Centro findAll(@PathVariable Long id) {
        Centro resultado = repositorio.findById(id).get();
        return resultado;

    }

    @PostMapping
    public Centro insert(@RequestBody Centro centro) {
        Centro resultado = repositorio.save(centro);
        return resultado;

    }
}
