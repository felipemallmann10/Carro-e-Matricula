package com.example;

import java.util.Scanner;

import com.example.matriculas.GestorMatriculas;
import com.example.matriculas.MatriculaFactory;
import com.example.matriculas.MatriculaMaritima;
import com.example.matriculas.MatriculaTerrestre;
import com.example.veiculos.Barco;
import com.example.veiculos.Carro;
import com.example.veiculos.Mota;
import com.example.veiculos.Veiculo;

public class Garagem {

    private final Veiculo[] vagas;
    private final GestorMatriculas gestorMatriculas;

    public Garagem() {

        vagas = new Veiculo[5];
        gestorMatriculas = new GestorMatriculas();
    }

    // ==============================
    // CRIAR CARRO
    // ==============================

    public void criarCarro(Scanner scanner) {

        if (garagemCheia()) {
            System.out.println("A garagem está cheia.");
            return;
        }

        System.out.println();
        System.out.println("========== CRIAR CARRO ==========");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Quilometragem: ");
        double quilometragem = scanner.nextDouble();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        MatriculaTerrestre matricula =
                MatriculaFactory.criarMatriculaTerrestre(ano);

        Carro carro = new Carro(
                marca,
                modelo,
                cor,
                matricula,
                ano,
                quilometragem,
                preco
        );

        adicionarVeiculo(carro);

        System.out.println();
        System.out.println("Carro criado com sucesso.");
        System.out.println("Matrícula atribuída: "
                + carro.getCodigoMatricula());
    }

    // ==============================
    // CRIAR MOTA
    // ==============================

    public void criarMota(Scanner scanner) {

        if (garagemCheia()) {
            System.out.println("A garagem está cheia.");
            return;
        }

        System.out.println();
        System.out.println("========== CRIAR MOTA ==========");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Quilometragem: ");
        double quilometragem = scanner.nextDouble();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        MatriculaTerrestre matricula =
                MatriculaFactory.criarMatriculaTerrestre(ano);

        Mota mota = new Mota(
                marca,
                modelo,
                cor,
                matricula,
                ano,
                quilometragem,
                preco
        );

        adicionarVeiculo(mota);

        System.out.println();
        System.out.println("Mota criada com sucesso.");
        System.out.println("Matrícula atribuída: "
                + mota.getCodigoMatricula());
    }

    // ==============================
    // CRIAR BARCO
    // ==============================

    public void criarBarco(Scanner scanner) {

        if (garagemCheia()) {
            System.out.println("A garagem está cheia.");
            return;
        }

        System.out.println();
        System.out.println("========== CRIAR BARCO ==========");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        // Dados necessários para a matrícula marítima
        System.out.print("Categoria marítima: ");
        String categoria = scanner.nextLine();

        System.out.print("Província marítima: ");
        String provinciaMaritima = scanner.nextLine();

        System.out.print("Distrito marítimo: ");
        int distritoMaritimo = scanner.nextInt();

        scanner.nextLine();

        MatriculaMaritima matricula =
                MatriculaFactory.criarMatriculaMaritima(
                        ano,
                        categoria,
                        provinciaMaritima,
                        distritoMaritimo
                );

        Barco barco = new Barco(
                marca,
                modelo,
                cor,
                matricula,
                ano,
                preco
        );

        adicionarVeiculo(barco);

        System.out.println();
        System.out.println("Barco criado com sucesso.");
        System.out.println("Matrícula atribuída: "
                + barco.getCodigoMatricula());
    }

    // ==============================
    // ADICIONAR VEÍCULO
    // ==============================

    private boolean adicionarVeiculo(Veiculo veiculo) {

        for (int i = 0; i < vagas.length; i++) {

            if (vagas[i] == null) {

                vagas[i] = veiculo;

                gestorMatriculas.guardar(veiculo);

                return true;
            }
        }

        return false;
    }

    // ==============================
    // MOSTRAR GARAGEM
    // ==============================

    public void mostrarGaragem() {

        System.out.println();
        System.out.println("==============================");
        System.out.println("          GARAGEM");
        System.out.println("==============================");

        for (int i = 0; i < vagas.length; i++) {

            System.out.println();
            System.out.println("VAGA " + (i + 1));

            if (vagas[i] == null) {

                System.out.println("VAZIA");

            } else {

                vagas[i].mostrarInformacao();
            }
        }

        System.out.println();
        System.out.println("==============================");
    }

    // ==============================
    // REMOVER VEÍCULO
    // ==============================

    public void removerVeiculo(Scanner scanner) {

        System.out.println();
        System.out.println("========== REMOVER VEÍCULO ==========");

        System.out.print("Introduza a matrícula: ");
        String codigo = scanner.nextLine();

        for (int i = 0; i < vagas.length; i++) {

            if (vagas[i] != null
                    && vagas[i].getCodigoMatricula().equalsIgnoreCase(codigo)) {

                gestorMatriculas.remover(
                        vagas[i].getCodigoMatricula()
                );

                vagas[i] = null;

                System.out.println();
                System.out.println("Veículo removido com sucesso.");

                return;
            }
        }

        System.out.println();
        System.out.println("Não foi encontrado nenhum veículo com essa matrícula.");
    }

    // ==============================
    // PROCURAR VEÍCULO
    // ==============================

    public void procurarVeiculo(Scanner scanner) {

        System.out.println();
        System.out.println("========== PROCURAR VEÍCULO ==========");

        System.out.print("Introduza a matrícula: ");
        String codigo = scanner.nextLine();

        Veiculo veiculo = gestorMatriculas.procurar(codigo);

        if (veiculo == null) {

            System.out.println();
            System.out.println("Veículo não encontrado.");

        } else {

            veiculo.mostrarInformacao();
        }
    }

    // ==============================
    // VER MATRÍCULAS
    // ==============================

    public void mostrarMatriculas() {

        gestorMatriculas.mostrarMatriculas();
    }

    // ==============================
    // VER LUGARES DISPONÍVEIS
    // ==============================

    public int getLugaresDisponiveis() {

        int lugares = 0;

        for (Veiculo vaga : vagas) {

            if (vaga == null) {
                lugares++;
            }
        }

        return lugares;
    }

    // ==============================
    // VERIFICAR SE ESTÁ CHEIA
    // ==============================

    private boolean garagemCheia() {

        return getLugaresDisponiveis() == 0;
    }
}