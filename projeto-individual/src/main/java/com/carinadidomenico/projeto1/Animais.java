package com.carinadidomenico.projeto1;

import java.util.ArrayList;
import java.util.List;

public abstract class Animais {

    private String nome;
    private String tipo;
    private String raca;
    private String idade;
    private List problemaSaude = new ArrayList();

    public Animais(String nome, String tipo, String raca, String idade, List problemaSaude) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.problemaSaude = problemaSaude;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public String getIdade() {
        return idade;
    }

    public List getProblemaSaude() {
        return problemaSaude;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\'' +
                ", tipo: " + tipo + '\'' +
                ", raca: " + raca + '\'' +
                ", idade: " + idade + '\'' +
                ", problemas de saúde: " + problemaSaude;
    }
}
