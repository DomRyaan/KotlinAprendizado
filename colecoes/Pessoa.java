package com.exemplo.aprendendokotlinzero.colecoes;

public class Pessoa {
    private String nome;
    private int idade = 0;

   public String getNome() {
       return this.nome;
   }

    public void setNome(String nome) {
        System.out.println("Chamando o metodo Set: " + nome);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
