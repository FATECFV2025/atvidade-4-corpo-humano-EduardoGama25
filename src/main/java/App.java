package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Biblioteca para entrada de dados (Scanner)
        Scanner ler = new Scanner(System.in); 

        //Definindo as variáveis locais
        double massa;
        double volume;
        double densidade;
        double altura;

        System.out.println("IMC - Atividade");
        
        System.out.printf("Digite sua massa(Ex: 70): ");
        // Atribuindo o valor da variável "massa" com o Scanner
        massa = ler.nextDouble();

        System.out.printf("Digite seu volume(Ex: 0,07): ");
        // Atribuindo o valor da variável "volume" com o Scanner
        volume = ler.nextDouble();

        System.out.printf("Digite sua densidade(Ex: 1000): ");
        // Atribuindo o valor da variável "densidade" com o Scanner
        densidade = ler.nextDouble();

        System.out.printf("Digite sua altura(Ex: 1,70): ");
        // Atribuindo o valor da variável "altura" com o Scanner
        altura = ler.nextDouble();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);
        // Teste da Primeira e Segunda Instrução
        //c1.massa = "2";

        // Teste da Terceira Instrução
        // c1.setVolume(0.08);


        System.out.println("\nVALORES INICIAIS");
        System.out.println("Massa = " + c1.getMassa() + " kg");
        System.out.println("Volume = " + c1.getVolume() + " m³");
        System.out.println("Densidade = " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura = " + c1.getAltura() + " m");
        System.err.printf("IMC = %.2f\n", c1.calcularIMC());



        // Utilizando o Setter para definir/alterar os valores
        System.out.println("\nALTERAÇÃO DE DADOS COM O SETTER");

        System.out.printf("Digite uma nova massa (kg): ");
        double novaMassa = ler.nextDouble();
        c1.setMassa(novaMassa);

        System.out.printf("Digite uma nova altura (m): ");
        double novaAltura = ler.nextDouble();
        c1.setAltura(novaAltura);

        
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.printf("Novo IMC: %.2f\n", c1.calcularIMC()); 

        ler.close();
    }
}
