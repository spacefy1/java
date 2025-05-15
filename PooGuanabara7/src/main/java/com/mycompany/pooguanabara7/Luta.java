package com.mycompany.pooguanabara7;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante; 
    private int rounds; 
    private boolean aprovada; 
     
    public void marcarLuta(Lutador lu1, Lutador lu2){
        if(lu1.getCategoria().equals(lu2.getCategoria())
                && lu1 != lu2){  
            this.setAprovada(true);
            this.desafiado = lu1;
            this.desafiante = lu2;
        
    } else{
        this.aprovada = false; 
        this.desafiado = null;
        this.desafiante = null; 
        }   
    }
    
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            
    
            
            Random al = new Random();
            int vencedor = al.nextInt(3); // 0 1 2 
            System.out.println("========= RESULTADO DA LUTA ==========");
            switch (vencedor) {
                case 0:
                    // empate
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: 
                    //desafiado vence
                    System.out.println("O " + this.desafiado.getNome() + " ganhou!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: 
                    //desafiante vence
                    System.out.println("O " + this.desafiante.getNome() + " ganhou!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=============");
        }else {
            System.out.println("Error em começar a luta");
        }
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() { //bollean 
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}

