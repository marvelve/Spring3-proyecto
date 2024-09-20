/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;


import com.interivalle.spring3.modelo.Usuario;
import com.interivalle.spring3.servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import java.util.*;
/**
 *
 * @author Marysela Velasco
 */

 @Controller
public class UsuarioControler {
    
    @Autowired
    private IUsuarioServicio usuarioServicio;
    
     @GetMapping("/registro")  // Maneja la solicitud GET para mostrar el formulario
    public String mostrarFormulario() {
        return "Registro";  // El nombre de la vista (Registro.html) sin la extensión
    }
    
   @PostMapping("/registro")
    public String guardarUsuario(Usuario usuario) {
   
        usuarioServicio.guardarUsuario(usuario);
        return "Login";
    }
    
    
}
