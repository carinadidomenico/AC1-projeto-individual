package com.carinadidomenico.projeto1;

import java.util.List;

public interface Animais {

    private String nome;
    private String tipo;
    private String raca;
    private String idade;
    private List<> problemaSaude;

    public Animais(String nome, String tipo, String raca, String idade, List problemaSaude) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.problemaSaude = problemaSaude;
    }

}
