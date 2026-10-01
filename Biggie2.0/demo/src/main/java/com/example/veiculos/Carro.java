package com.example.veiculos;

import com.example.matriculas.MatriculaTerrestre;

public class Carro extends Veiculo {

    private final int ano;
    private final double quilometragem;
    private final double preco;

    public Carro(
            String marca,
            String modelo,
            String cor,
            MatriculaTerrestre matricula,
            int ano,
            double quilometragem,
            double preco) {

        super(
                marca,
                modelo,
                cor,
                matricula
        );

        this.ano = ano;
        this.quilometragem = quilometragem;
        this.preco = preco;
    }

    @Override
    public void mostrarInformacao() {

        System.out.println();
        System.out.println("========== CARRO ==========");

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Matrícula: " + getCodigoMatricula());
        System.out.println("Ano: " + ano);
        System.out.println(
                "Quilometragem: "
                + quilometragem
                + " km"
        );
        System.out.println(
                "Preço: "
                + preco
                + " €"
        );
    }
}