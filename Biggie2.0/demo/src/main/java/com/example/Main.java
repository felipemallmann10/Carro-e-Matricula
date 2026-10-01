package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Uma única garagem para todo o programa
        Garagem garagem = new Garagem();

        int opcao;

        do {

            System.out.println();
            System.out.println("==============================");
            System.out.println("       SISTEMA DE GARAGEM");
            System.out.println("==============================");
            System.out.println("1 - Criar carro");
            System.out.println("2 - Criar mota");
            System.out.println("3 - Criar barco");
            System.out.println("4 - Ver garagem");
            System.out.println("5 - Procurar veículo");
            System.out.println("6 - Remover veículo");
            System.out.println("7 - Ver matrículas");
            System.out.println("8 - Sair");
            System.out.println("==============================");
            System.out.println(
                    "Lugares disponíveis: "
                    + garagem.getLugaresDisponiveis()
            );
            System.out.println("==============================");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    garagem.criarCarro(scanner);
                    break;

                case 2:
                    garagem.criarMota(scanner);
                    break;

                case 3:
                    garagem.criarBarco(scanner);
                    break;

                case 4:
                    garagem.mostrarGaragem();
                    break;

                case 5:
                    garagem.procurarVeiculo(scanner);
                    break;

                case 6:
                    garagem.removerVeiculo(scanner);
                    break;

                case 7:
                    garagem.mostrarMatriculas();
                    break;

                case 8:
                    System.out.println();
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 8);

        scanner.close();
    }
}