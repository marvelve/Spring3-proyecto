/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.servicio;

import com.interivalle.spring3.modelo.Usuario;
import com.interivalle.spring3.repositorio.IUsuarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marysela Velasco
 */
@Service
public class UsuarioServicio implements IUsuarioServicio{
    
    @Autowired
    private IUsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
         Optional<Usuario> usuarioOpt = usuarioRepositorio.findByEmail(email);
        return usuarioOpt.orElse(null);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }
    
    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepositorio.findAll();
    } 
    
}
