/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.controlador;

import com.interivalle.spring3.modelo.Madera;
import com.interivalle.spring3.servicio.IMaderaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Marysela Velasco
 */
 @Controller
public class MaderaControler {
     @Autowired
    private IMaderaServicio maderaServicio;
     
     
     @GetMapping("/madera")  // Maneja la solicitud GET para mostrar el formulario
    public String mostrarFormulario() {
        return "Madera";  // El nombre de la vista (Registro.html) sin la extensión
    }
    
   @PostMapping("/madera")
    public String guardaMadera(@ModelAttribute Madera madera) {

    // Guardar en la base de datos si no hay errores
        maderaServicio.guardarMadera(madera);
        return "Cotizacion";
    }
    
}
