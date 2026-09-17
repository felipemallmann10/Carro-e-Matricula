public class Carro {

    // =========================
    // ATRIBUTOS
    // =========================

    private String marca;
    private String modelo;
    private String cor;

    private int numeroLugares;
    private int numeroPortas;

    private String tipoCombustivel;
    private double cilindrada;
    private int potencia;

    private int ano;
    private double quilometragem;
    private double preco;

    private int velocidadeMaxima;
    private int velocidadeAtual;

    private String tipoCaixa;
    private int numeroMudancas;

    private double peso;
    private double comprimento;
    private double altura;
    private double largura;

    private String tipoCarro;

    private boolean ligado;


    // =========================
    // CONSTRUTOR
    // =========================

    public Carro(
            String marca,
            String modelo,
            String cor,
            int numeroLugares,
            int numeroPortas,
            String tipoCombustivel,
            double cilindrada,
            int potencia,
            int ano,
            double quilometragem,
            double preco,
            int velocidadeMaxima,
            String tipoCaixa,
            int numeroMudancas,
            double peso,
            double comprimento,
            double altura,
            double largura,
            String tipoCarro) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;

        this.numeroLugares = numeroLugares;
        this.numeroPortas = numeroPortas;

        this.tipoCombustivel = tipoCombustivel;
        this.cilindrada = cilindrada;
        this.potencia = potencia;

        this.ano = ano;
        this.quilometragem = quilometragem;
        this.preco = preco;

        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;

        this.tipoCaixa = tipoCaixa;
        this.numeroMudancas = numeroMudancas;

        this.peso = peso;
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;

        this.tipoCarro = tipoCarro;

        // O carro começa sempre desligado
        this.ligado = false;
    }


    // =========================
    // MÉTODOS
    // =========================

    public void ligar() {

        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }


    public void desligar() {

        if (velocidadeAtual > 0) {
            System.out.println("Não é possível desligar o carro enquanto está em movimento.");
        } else if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }


    public void andar() {

        if (!ligado) {
            System.out.println("O carro não pode andar porque está desligado.");
        } else {
            velocidadeAtual = 10;
            System.out.println("O carro começou a andar.");
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }


    public void acelerar() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
        } else if (velocidadeAtual >= velocidadeMaxima) {
            System.out.println("O carro já atingiu a velocidade máxima.");
        } else {
            velocidadeAtual += 10;

            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }

            System.out.println("O carro acelerou.");
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }


    public void travar() {

        if (velocidadeAtual == 0) {
            System.out.println("O carro já está parado.");
        } else {
            velocidadeAtual -= 10;

            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }

            System.out.println("O carro travou.");
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }


    // =========================
    // MOSTRAR INFORMAÇÕES
    // =========================

    public void mostrarInformacoes() {

        System.out.println("================================");
        System.out.println("       INFORMAÇÕES DO CARRO");
        System.out.println("================================");

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);

        System.out.println("Número de lugares: " + numeroLugares);
        System.out.println("Número de portas: " + numeroPortas);

        System.out.println("Tipo de combustível: " + tipoCombustivel);
        System.out.println("Cilindrada: " + cilindrada + " L");
        System.out.println("Potência: " + potencia + " cv");

        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Preço: " + preco + " €");

        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");

        System.out.println("Tipo de caixa: " + tipoCaixa);
        System.out.println("Número de mudanças: " + numeroMudancas);

        System.out.println("Peso: " + peso + " kg");
        System.out.println("Comprimento: " + comprimento + " m");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Largura: " + largura + " m");

        System.out.println("Tipo de carro: " + tipoCarro);

        if (ligado) {
            System.out.println("Estado: Ligado");
        } else {
            System.out.println("Estado: Desligado");
        }

        System.out.println("================================");
    }
}