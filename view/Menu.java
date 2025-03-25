package view;
import java.util.Scanner;
import controller.*;


public class Menu {
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        double result;
        while (opcao != 0) {
            System.out.println("=== Calculadora ===");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Somar.");   
                    Soma soma = new Soma();
                    result = soma.somar();
                    System.out.println("Resultado: " + result);
                    break;

                case 2:
                    System.out.println("Você escolheu Subtrair.");
                    Subtrair subtrair = new Subtrair();
                    result = subtrair.subtrair();
                    System.out.println("Resultado: " + result);
                    break;
                case 3:
                    System.out.println("Você escolheu Multiplicar.");
                    Multiplicar multiplicar = new Multiplicar();
                    result = multiplicar.multiplicar();
                    System.out.println("Resultado: " + result);
                    break;
                case 4:
                    System.out.println("Você escolheu Dividir.");
                    Dividir dividir = new Dividir();
                    result = dividir.dividir();
                    System.err.println("Resultado: " + result);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } 

        scanner.close();
    }
}