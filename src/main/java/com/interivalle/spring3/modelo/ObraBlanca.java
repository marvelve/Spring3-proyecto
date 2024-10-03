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
public class ObraBlanca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_actividad;
    
    @NotNull(message = "La medida del área privada es obligatoria")
    @DecimalMin(value = "0.0", inclusive = false, message = "La medida del área privada debe ser mayor que 0")
    double medidaAreaPrivada;
    double medidaCocina;
    double medidaBano;
    double medidaZonaOficios;  
    double medidaSalpicaderoCocina;
    int cantidadBanos;
    int cantidadPoyos=0;
    int cantidadPanel=0;
    int cantidadMuros=0;
    int cantidadPuntosElectricos=0;
}
