package com.example.matriculas;

import java.util.HashMap;
import java.util.Map;

import com.example.veiculos.Veiculo;

public class GestorMatriculas {

    private final Map<String, Veiculo> matriculas;

    public GestorMatriculas() {
        matriculas = new HashMap<>();
    }

    public void guardar(Veiculo veiculo) {

        String codigo = veiculo.getCodigoMatricula();

        matriculas.put(codigo, veiculo);
    }

    public Veiculo procurar(String codigo) {

        return matriculas.get(codigo);
    }

    public boolean remover(String codigo) {

        if (matriculas.containsKey(codigo)) {

            matriculas.remove(codigo);

            return true;
        }

        return false;
    }

    public boolean existe(String codigo) {

        return matriculas.containsKey(codigo);
    }

    public void mostrarMatriculas() {

        System.out.println();
        System.out.println("==============================");
        System.out.println("       MATRÍCULAS GUARDADAS");
        System.out.println("==============================");

        if (matriculas.isEmpty()) {

            System.out.println("Não existem matrículas.");

        } else {

            for (Map.Entry<String, Veiculo> entrada : matriculas.entrySet()) {

                Veiculo veiculo = entrada.getValue();

                System.out.println(
                        entrada.getKey()
                        + " | "
                        + veiculo.getClass().getSimpleName()
                        + " | "
                        + veiculo.getMarca()
                        + " "
                        + veiculo.getModelo()
                );
            }
        }

        System.out.println("==============================");
    }
}