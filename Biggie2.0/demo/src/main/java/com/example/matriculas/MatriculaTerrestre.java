package com.example.matriculas;

public class MatriculaTerrestre extends Matricula {

    private final String pais;

    public MatriculaTerrestre(
            String codigo,
            String pais,
            int ano) {

        super(codigo, ano);

        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public void mostrarMatricula() {

        System.out.println("Matrícula: " + getCodigo());
        System.out.println("País: " + pais);
        System.out.println("Ano da primeira matrícula: " + getAno());
    }
}