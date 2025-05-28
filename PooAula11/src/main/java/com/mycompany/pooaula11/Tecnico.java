package com.mycompany.pooaula11;

public class Tecnico extends Aluno {
    private String registroProfissional; 

    public Tecnico(String nome, int idade, char sexo, String matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
        
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    public void praticar(){
        System.out.println(this.getNome() + "está praticando!!");
    }
    
    
    @Override 
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "é tecnico! Sua mensalidade está paga");
    }
}
