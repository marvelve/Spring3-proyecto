/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.servicio;

import com.interivalle.spring3.modelo.ObraBlanca;
import com.interivalle.spring3.repositorio.IObraBlancaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marysela Velasco
 */
@Service
public class ObraBlancaServicio implements IObraBlancaServicio{
  
    @Autowired
    private IObraBlancaRepositorio obrablancaRepositorio;
    
    
    @Override
    public ObraBlanca guardarActividad(ObraBlanca obrablanca) {
        return obrablancaRepositorio.save(obrablanca);
    }
    
}
