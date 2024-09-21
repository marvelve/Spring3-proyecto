/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;

import com.interivalle.spring3.modelo.Usuario;
import com.interivalle.spring3.servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Marysela Velasco
 */

 @Controller
public class LoginControler {
     
     @Autowired
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/login")
    public String mostrarLogin() {
        return "Login"; // Página de login
    }
    
    @PostMapping("/login")
    public String autenticarUsuario(@RequestParam("email") String email, 
                                    @RequestParam("contrasena") String contrasena, 
                                    Model model) {
        Usuario usuario = usuarioServicio.buscarUsuarioPorEmail(email);//buscarPorEmail(email);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return "ObraBlanca"; // Redirigir a la página de bienvenida
        } else {
            model.addAttribute("error", "Email o contraseña incorrectos");
            return "Login"; // Mostrar la página de login con el error
        }
    }
    
}
