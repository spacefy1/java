/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooguanabara12;

/**
 *
 * @author guilh
 */
public class PooGuanabara12 {

    public static void main(String[] args) {
        Cobra c = new Cobra(10.2, 5, 0, "Prata" ); 
        Canguru k = new Canguru(70.23, 7, 4, "Branco");
        Mamifero m = new Mamifero(100.2, 56, 4, "Preto");
        c.alimentar();
        c.emitirSom();
        c.locomover();
        
        k.alimentar();
        k.emitirSom();
        k.locomover();
        
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        
         
    }
}
