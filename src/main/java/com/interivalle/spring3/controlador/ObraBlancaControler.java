/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;

import com.interivalle.spring3.modelo.ObraBlanca;
import com.interivalle.spring3.servicio.IObraBlancaServicio;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Marysela Velasco
 */

 @Controller
public class ObraBlancaControler {
     
     @Autowired
    private IObraBlancaServicio obrablancaServicio;
    
     @GetMapping("/obrablanca")  // Maneja la solicitud GET para mostrar el formulario
    public String mostrarFormulario() {
        return "ObraBlanca";  // El nombre de la vista (Registro.html) sin la extensión
    }
    
   @PostMapping("/obrablanca")
    public String guardarUsuario(@ModelAttribute ObraBlanca obrablanca) {

    // Guardar en la base de datos si no hay errores
        obrablancaServicio.guardarActividad(obrablanca);
        return "Madera";
    }
    
}
