package com.example.veiculos;

import com.example.matriculas.Matricula;

public abstract class Veiculo {

    private final String marca;
    private final String modelo;
    private final String cor;
    private final Matricula matricula;

    public Veiculo(
            String marca,
            String modelo,
            String cor,
            Matricula matricula) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public String getCodigoMatricula() {
        return matricula.getCodigo();
    }

    public abstract void mostrarInformacao();
}