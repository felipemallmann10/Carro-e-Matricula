public class Main {

    public static void main(String[] args) {

        // Criar o objeto carro
        Carro carro1 = new Carro(
                "BMW",
                "M3",
                "Preto",
                5,
                4,
                "Gasolina",
                3.0,
                510,
                2024,
                15000,
                95000,
                250,
                "Automática",
                8,
                1730,
                4.79,
                1.43,
                1.90,
                "Sedan"
        );


        // Mostrar informações iniciais
        carro1.mostrarInformacoes();


        // Testar o comportamento do carro
        carro1.andar();

        carro1.ligar();

        carro1.andar();

        carro1.acelerar();

        carro1.acelerar();

        carro1.travar();

        carro1.travar();

        carro1.travar();

        carro1.desligar();
    }
}