package com.ecomarketspa.ecomarket.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecomarketspa.ecomarket.model.Usuario;
import com.ecomarketspa.ecomarket.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    

    
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }   


}
