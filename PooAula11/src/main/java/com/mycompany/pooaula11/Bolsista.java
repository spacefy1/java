/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula11;

/**
 *
 * @author guilh
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public Bolsista(String nome, int idade, char sexo, 
                    String matricula, String curso,
                    float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    } 
    
    @Override 
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "é bolsista! Sua mensalidade está paga");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
