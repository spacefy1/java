package com.mycompany.pooguanabara7;

public class PooGuanabara7 {
    public static void main(String[] args) {
        Lutador lu[] = new Lutador[6];

        lu[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lu[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lu[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lu[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lu[4] = new Lutador("UFCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lu[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
    

    for (Lutador lutador : lu){ //loop for-each que percorre o 
        lutador.apresentar();
        lutador.status();
    }
    
    lu[2].status();

    Luta U1 = new Luta();
    U1.marcarLuta(lu[0], lu[1]);
    U1.lutar();
    lu[0].status();
    lu[1].status(); 
    
    Luta U2 = new Luta(); 
    U2.marcarLuta(lu[1], lu[1]);
    U2.lutar();
    
    }
    
}