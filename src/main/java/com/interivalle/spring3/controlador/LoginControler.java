/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;

import com.interivalle.spring3.modelo.Usuario;
import com.interivalle.spring3.servicio.IUsuarioServicio;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marysela Velasco
 */

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginControler {
     
     @Autowired
    private IUsuarioServicio usuarioServicio;
    
    @PostMapping("/api/login")
    public ResponseEntity<?> autenticarUsuario(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String contrasena = loginData.get("contrasena");

        Usuario usuario = usuarioServicio.buscarUsuarioPorEmail(email);

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return ResponseEntity.ok("Login exitoso"); // Puedes enviar un objeto o un token JWT si lo prefieres
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email o contraseña incorrectos");
        }
    }
    
}
