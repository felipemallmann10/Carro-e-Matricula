

2. Organização dos packages

O projeto seguirá a estrutura convencional do Maven:

demo/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── Main.java
│   │   │           │
│   │   │           ├── veiculos/
│   │   │           │   ├── Veiculo.java
│   │   │           │   ├── Carro.java
│   │   │           │   ├── Mota.java
│   │   │           │   └── Barco.java
│   │   │           │
│   │   │           ├── matriculas/
│   │   │           │   ├── Matricula.java
│   │   │           │   ├── MatriculaTerrestre.java
│   │   │           │   ├── MatriculaMaritima.java
│   │   │           │   └── MatriculaFactory.java
│   │   │           │
│   │   │           └── garagem/
│   │   │               └── Garagem.java
│   │   │
│   │   └── resources/
│   │
│   └── test/
│       └── java/
│
└── pom.xml