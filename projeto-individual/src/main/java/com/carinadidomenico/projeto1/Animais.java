package com.carinadidomenico.projeto1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

// Classe que representa os animais para adoção
public abstract class Animais {

    private String nome;
    private String tipo;
    private String raca;
    private String idade;
    private Boolean castrado;
    private List problemaSaude;

    public Animais(String nome, String tipo, String raca, String idade, Boolean castrado) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.castrado = castrado;
        this.problemaSaude = new ArrayList();
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
