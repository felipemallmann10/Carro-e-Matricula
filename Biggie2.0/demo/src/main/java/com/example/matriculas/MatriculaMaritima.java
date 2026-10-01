package com.example.matriculas;

public class MatriculaMaritima extends Matricula {

    private final String categoria;
    private final String provinciaMaritima;
    private final int distritoMaritimo;

    public MatriculaMaritima(
            String codigo,
            int ano,
            String categoria,
            String provinciaMaritima,
            int distritoMaritimo) {

        super(codigo, ano);

        this.categoria = categoria;
        this.provinciaMaritima = provinciaMaritima;
        this.distritoMaritimo = distritoMaritimo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProvinciaMaritima() {
        return provinciaMaritima;
    }

    public int getDistritoMaritimo() {
        return distritoMaritimo;
    }

    @Override
    public void mostrarMatricula() {

        System.out.println("Matrícula: " + getCodigo());
        System.out.println("Ano: " + getAno());
        System.out.println("Categoria: " + categoria);
        System.out.println("Província Marítima: " + provinciaMaritima);
        System.out.println("Distrito Marítimo: " + distritoMaritimo);
    }
}