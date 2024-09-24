/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interivalle.spring3.repositorio;

import com.interivalle.spring3.modelo.Madera;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marysela Velasco
 */
public interface IMaderaRepositorio extends JpaRepository<Madera, String> {
    
}
