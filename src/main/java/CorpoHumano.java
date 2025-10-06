package main.java;
public class CorpoHumano {
    // Definindo os atributos da classe
    private double massa; //Teste da Segunda Instrução(Troca do private por public)
    private double volume;
    private double densidade;
    private double altura;

    // Criando o Constructor
    public CorpoHumano(double massaInicial, double volumeInicial, double densidadeInicial, double alturaInicial) {
        this.massa = massaInicial;
        this.volume = volumeInicial;
        this.densidade = densidadeInicial;
        this.altura = alturaInicial;
    }

    // Criando o Getter do atributo massa
    public double getMassa(){
        return massa;
    }

    // Criando o Getter do atributo volume
    public double getVolume() {
        return volume;
    }

    // Criando o Getter do atributo densidade
    public double getDensidade() {
        return densidade;
    }

    // Criando o Getter do atributo altura
    public double getAltura() {
        return altura;
    }

    // Criando o Setter do atributo massa
    public void setMassa(double novaMassa) {
        massa = novaMassa;
    }

    // Criando o Setter do atributo volume
    public void setVolume(double novoVolume) { //Teste da Terceira Instrução, alteração de public para private
        volume = novoVolume;
    }

    // Criando o Setter do atributo densidade
    public void setDensidade(double novaDensidade) {
        densidade = novaDensidade;
    }

    // Criando o Setter do atributo altura
    public void setAltura(double novaAltura) {
        altura = novaAltura;
    }

    // Criando a Função de Calcular o IMC
    public double calcularIMC() {
        return (massa / (altura * altura));
    }

}
