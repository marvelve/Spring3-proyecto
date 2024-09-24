/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.servicio;

import com.interivalle.spring3.modelo.Madera;
import com.interivalle.spring3.modelo.ObraBlanca;
import com.interivalle.spring3.repositorio.IMaderaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marysela Velasco
 */
@Service
public class MaderaServicio implements IMaderaServicio {
    
    @Autowired
    private IMaderaRepositorio maderaRepositorio;
    
    
    @Override
    public Madera guardarMadera(Madera madera) {
        return maderaRepositorio.save(madera);
    }

    
}
