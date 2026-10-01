package com.example.matriculas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MatriculaFactory {

    private static final Random RANDOM = new Random();

    private static final Set<String> matriculasExistentes = new HashSet<>();

    private static final String LETRAS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String NUMEROS =
            "0123456789";

    public static MatriculaTerrestre criarMatriculaTerrestre(int ano) {

        String codigo;

        do {
            codigo = gerarCodigoTerrestre();
        } while (matriculasExistentes.contains(codigo));

        matriculasExistentes.add(codigo);

        return new MatriculaTerrestre(
                codigo,
                "Portugal",
                ano
        );
    }

    private static String gerarCodigoTerrestre() {

        char letra1 = letraAleatoria();
        char letra2 = letraAleatoria();

        char numero1 = numeroAleatorio();
        char numero2 = numeroAleatorio();

        char letra3 = letraAleatoria();
        char letra4 = letraAleatoria();

        return String.format(
                "%c%c-%c%c-%c%c",
                letra1,
                letra2,
                numero1,
                numero2,
                letra3,
                letra4
        );
    }

    public static MatriculaMaritima criarMatriculaMaritima(
            int ano,
            String categoria,
            String provinciaMaritima,
            int distritoMaritimo) {

        String codigo;

        do {

            int numero = RANDOM.nextInt(1_000_000);

            codigo = String.format(
                    "%s-%s-%d-%06d-%02d",
                    categoria,
                    provinciaMaritima,
                    distritoMaritimo,
                    numero,
                    ano % 100
            );

        } while (matriculasExistentes.contains(codigo));

        matriculasExistentes.add(codigo);

        return new MatriculaMaritima(
                codigo,
                ano,
                categoria,
                provinciaMaritima,
                distritoMaritimo
        );
    }

    private static char letraAleatoria() {

        return LETRAS.charAt(
                RANDOM.nextInt(LETRAS.length())
        );
    }

    private static char numeroAleatorio() {

        return NUMEROS.charAt(
                RANDOM.nextInt(NUMEROS.length())
        );
    }
}