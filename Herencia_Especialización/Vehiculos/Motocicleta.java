/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

/**
 *
 * @author ADMIN
 */
public class Motocicleta extends Vehiculos {
    
    private boolean tieneMaletero;

    public Motocicleta(String marca, String modelo, boolean tieneMaletero) {
        super(marca, modelo);
        this.tieneMaletero = tieneMaletero;
    }

    // Método específico para la clase Motocicleta
    public void realizarAcrobacias() {
        System.out.println("Realizando acrobacias en la motocicleta.");
    }
    
}
