/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interivalle.spring3.modelo;

import jakarta.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Maricela Velasco
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_usuario;
   
    @Email
    String email;
    
    @Size(min = 6, message = "La contraseña debe tener mas de 6 caracteres")
    String contrasena;
    
    String nombre_completo;
    String nombre_proyecto;
    String ciudad;
    
    
}
