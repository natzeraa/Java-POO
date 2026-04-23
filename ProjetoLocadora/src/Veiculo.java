// Sistema de veículos - 4 Pilares da POO em java
// Uma locadora de veículos precisa calcular o valor da diária
// De diferentes tipos de veículos (carro e moto)
// Cada tipo tem seu proprio calculo

// Pilar 1 - ABSTRAÇÃO
// Modelar apenas o que importa: marca, modelo, ano, placa, preço base
// Metodo calcularDiaria() abstrato, pois cada vículo tera sua propria diaria (calculo)

// ATRIBUTOS PROTEGIDOS -> Encapsulamentos
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    // Construtor da classe
    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;
    }

    // Metodo abstrato - cada subtipo define o calculo
    public abstract double calcularDiaria();

    // Pilar 2 - ENCAPSULAMENTO
    // MODIFICADORES VIA GETTERS E SETTERS
    // O SETTER PRECOBASE TEM VALIDAÇÃO: NÃO ACEITA VALORES NEGATIVOS

    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAno(){
        return ano;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        if(precoBase < 0){
            System.out.println("Erro: preço não pode ser negativo.");
            return;
        }

        this.precoBase = precoBase;
    }

    public String exibirDados(){
        return marca + " " + modelo + " (" + ano + ") " + placa + " R$" + precoBase + " ";
    }

}

// PILAR 3 - HERANÇA
// Carro e moto herdam tudo de Veiculo, mas cada um adiciona seus proprios atributos
// e implementa calcularDiaria() do seu jeito.

// Carro -> qtdPortas (atributo)
// metodo calcularDiaria -> se qtdPortas >=4 acrescimo de 20%