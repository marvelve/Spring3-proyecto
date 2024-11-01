/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;


import com.interivalle.spring3.modelo.Usuario;
import com.interivalle.spring3.servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Marysela Velasco
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
 //@Controller
public class UsuarioControler {
    
    @Autowired
    private IUsuarioServicio usuarioServicio;
    
    
    @PostMapping("/api/usuarios")
    public ResponseEntity<?> guardarUsuario(@Valid @RequestBody Usuario usuario, BindingResult result) {
    if (result.hasErrors()) {
        // Retornar un objeto con los errores de validación
        Map<String, String> errores = new HashMap<>();
        result.getFieldErrors().forEach(error -> errores.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errores);
    }

        usuarioServicio.guardarUsuario(usuario);
        return ResponseEntity.ok("Usuario registrado correctamente");
    }
    
     @GetMapping ("/api/usuarios")
    public ResponseEntity<List<Usuario>> listarUsuario() {
        List<Usuario> usuarios = usuarioServicio.listarUsuario();
        return ResponseEntity.ok(usuarios);
    }
    
    
}
