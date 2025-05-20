package com.mycompany.poo09guanabara;

import java.util.ArrayList;
import java.util.List;

public class Poo09Guanabara {

    public static void main(String[] args) {
        //decidi usar listas, por familiaridade com o tema
        List<Livro> livros = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();
        
        //criaçao de objetos pessoa
        Pessoa p1 = new Pessoa("Alex", 43, "M");
        Pessoa p2 = new Pessoa("Maria", 26, "F");
        
        //criaçao de objeto livro
        Livro e = new Livro("As Vantagens de Ser Invisivel", "ablueblue", 200, p1);
        Livro e2 = new Livro("Poo para Iniciantes", "Pedro Paulo", 60, p2);
        Livro e3 = new Livro("Diario de um Banana", "Oliver", 500, p1);
        
        //adicionando a lista LIVROS a instancia da classe livro
        livros.add(e);
        livros.add(e2);
        livros.add(e3);
        
        e.abrir();
        e.folhear(100);
        e.avancarPag();
        System.out.println(e.detalhes());
        
        e2.abrir();
        System.out.println(e2.detalhes());
        
    }
}
