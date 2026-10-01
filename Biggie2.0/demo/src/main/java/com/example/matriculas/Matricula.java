package com.example.matriculas;

public abstract class Matricula {

    private final String codigo;
    private final int ano;

    public Matricula(String codigo, int ano) {
        this.codigo = codigo;
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    public abstract void mostrarMatricula();
}