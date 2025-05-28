package com.mycompany.pooguanabara12;

public class Canguru extends Mamifero {
    
    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
        
    }
    
    public void usarBolsa(){
        System.out.println("Canguru está usando sua bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
}
