package com.mycompany.pooaula11;

public class Aluno extends Pessoa{
    private String matricula; 
    private String curso;
    
    public Aluno(String nome, int idade, char sexo, 
                String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso; 
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade de " + this.getNome() + "paga");
    }
    
}
