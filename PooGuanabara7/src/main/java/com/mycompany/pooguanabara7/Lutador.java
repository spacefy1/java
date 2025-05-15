package com.mycompany.pooguanabara7;


class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Construtor
    public Lutador(String nome, String nacionalidade, int idade,
                   double altura, double peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);       // ajusta também a categoria
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Getters e setters — note que setPeso() recalcula a categoria
    public String getNome() { 
        return nome; 
    }
    
    public String getNacionalidade() { 
        return nacionalidade; 
    }
    
    public int getIdade() { 
        return idade; 
    }
    
    public double getAltura() { 
        return altura; 
    }
    
    public double getPeso() { 
        return peso; 
    }
    
    public String getCategoria() { 
        return categoria; }
    
    public int getVitorias() { 
        return vitorias; 
    }
    
    public int getDerrotas() { 
        return derrotas; 
    }
    
    public int getEmpates() { 
        return empates; 
    }

    //metodos set
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método privado para definir categoria com base no peso
    private void setCategoria(String categoria) {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos de comportamento
    public void apresentar() {
        System.out.println("--------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade()
                         + ", " + this.getIdade() + " anos e "
                         + this.getAltura() + "m de altura");
        System.out.printf("Pesando %.1f kg, na categoria %s\n", 
                          this.getPeso(), this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias() +
                           " | Derrotas: " + this.getDerrotas() +
                           " | Empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() +
                           " com " + this.getVitorias() + " vitórias, " +
                           this.getDerrotas() + " derrotas e " +
                           this.getEmpates() + " empates.");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }  
}
