package com.example.veiculos;

import com.example.matriculas.MatriculaMaritima;

public class Barco extends Veiculo {

    private final int ano;
    private final double preco;

    public Barco(
            String marca,
            String modelo,
            String cor,
            MatriculaMaritima matricula,
            int ano,
            double preco) {

        super(
                marca,
                modelo,
                cor,
                matricula
        );

        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public void mostrarInformacao() {

        System.out.println();
        System.out.println("========== BARCO ==========");

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Matrícula: " + getCodigoMatricula());
        System.out.println("Ano: " + ano);
        System.out.println(
                "Preço: "
                + preco
                + " €"
        );
    }
}