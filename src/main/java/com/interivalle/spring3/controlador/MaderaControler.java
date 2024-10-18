/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;

import com.interivalle.spring3.modelo.Madera;
import com.interivalle.spring3.servicio.IMaderaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marysela Velasco
 */
 @RestController
 @CrossOrigin(origins = "http://localhost:3000")
public class MaderaControler {
     @Autowired
    private IMaderaServicio maderaServicio;
     
    
   @PostMapping("/api/madera")
    public ResponseEntity<String> guardarMadera(@RequestBody Madera madera) {
        try {
            // Guardar en la base de datos
            maderaServicio.guardarMadera(madera);
            return ResponseEntity.ok("Cotización de Madera guardada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar la cotización");
        }
    }
}
