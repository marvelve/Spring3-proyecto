/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.servicio;

import com.interivalle.spring3.modelo.Usuario;
import com.interivalle.spring3.repositorio.IUsuarioRepositorio;
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
         Usuario usuario= usuarioRepositorio.findById(email).orElse(null);
         return usuario;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }





   
    
}
