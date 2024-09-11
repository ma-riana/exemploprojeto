package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.RespostaFormulario;
import com.exemploprojeto2.repositories.RespostaFormularioRepository;

@RestController
@RequestMapping(value = "/respostas-formulario")
public class RespostaFormularioController {

    @Autowired
    private RespostaFormularioRepository repositorio;

    @GetMapping
    public List<RespostaFormulario> findAll() {
        List<RespostaFormulario> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public RespostaFormulario findById(@PathVariable Long id) {
        RespostaFormulario resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public RespostaFormulario insert(@RequestBody RespostaFormulario respostaFormulario) {
        RespostaFormulario resultado = repositorio.save(respostaFormulario);
        return resultado;
    }
}
