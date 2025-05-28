/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooguanabara12;

/**
 *
 * @author guilh
 */
public class Tartaruga extends Reptil {
    
    public Tartaruga(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
        
    @Override 
    public void locomover(){
        System.out.println("Rastejando");
    }
}
