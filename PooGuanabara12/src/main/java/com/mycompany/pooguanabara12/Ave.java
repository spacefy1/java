package com.mycompany.pooguanabara12;

public class Ave extends Animal {
    private String corPena;
    
    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena; 
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando de alpiste");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piando");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho ");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
