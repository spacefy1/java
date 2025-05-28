
package com.mycompany.pooguanabara12;

public class Cachorro extends Mamifero{
    
    public Cachorro(double peso, int idade, 
                    int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public void enterrarOsso(){
        System.out.println("Cachorro está enterrando o sso");
    }
    
    public void abanarRabo(){
        System.out.println("Cachorro está abando o rabo");
    }
}
