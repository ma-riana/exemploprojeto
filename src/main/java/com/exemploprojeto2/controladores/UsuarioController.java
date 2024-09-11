package com.exemploprojeto2.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemploprojeto2.entidades.Usuario;
import com.exemploprojeto2.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repositorio;

    @GetMapping
    public List<Usuario> findAll() {
        List<Usuario> resultado = repositorio.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        Usuario resultado = repositorio.findById(id).orElse(null);
        return resultado;
    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {
        Usuario resultado = repositorio.save(usuario);
        return resultado;
    }
}
