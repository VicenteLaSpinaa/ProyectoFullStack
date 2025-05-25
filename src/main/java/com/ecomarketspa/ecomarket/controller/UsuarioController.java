package com.ecomarketspa.ecomarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomarketspa.ecomarket.model.Usuario;
import com.ecomarketspa.ecomarket.service.UsuarioService;



@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
     @GetMapping("/formulario")
    public String formulario(){

        return "formulario";
    }

    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.findAll();
    }
    
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

}
