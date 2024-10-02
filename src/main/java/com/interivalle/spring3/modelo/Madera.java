/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Marysela Velasco
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Madera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_madera;
    
    @NotNull(message = "La medida Mueble Alto es obligatoria")
    @DecimalMin(value = "0.0", inclusive = false, message = "La medida debe ser mayor que 0")
    double anchoMuebleAlto;
    double anchoMuebleBajo;
    double anchoMuebleBano;
    double anchoCloset=0.0;
    double anchoVestier=0.0;
    int cantidadCloset=0;
    int cantidadPuertas=0;
    double medidaPuertas=0.0;
}
