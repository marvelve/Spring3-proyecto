/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;

import com.interivalle.spring3.modelo.ObraBlanca;
import com.interivalle.spring3.servicio.IObraBlancaServicio;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
public class ObraBlancaControler {
     
     @Autowired
    private IObraBlancaServicio obrablancaServicio;
    
   @PostMapping("/api/obrablanca")
   public ResponseEntity<String> guardarObraBlanca(@RequestBody ObraBlanca obrablanca) {
        try {
            // Guardar en la base de datos si no hay errores
            obrablancaServicio.guardarActividad(obrablanca);
            return ResponseEntity.ok("Obra Blanca guardada correctamente");
        } catch (Exception e) {
            // Manejar posibles errores y retornar un mensaje adecuado
            return ResponseEntity.status(500).body("Error al guardar la Obra Blanca");
        }
    }
    
}
