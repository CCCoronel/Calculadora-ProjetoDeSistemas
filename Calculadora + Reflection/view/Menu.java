package view;
import java.util.Scanner;
import controller.*;


public class Menu {
    double a, b;
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
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
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("soma", a, b));
                    break;

                case 2:
                    System.out.println("Você escolheu Subtrair.");
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("subtracao", a, b));
                    break;
                case 3:
                    System.out.println("Você escolheu Multiplicar.");
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("multiplicacao", a, b));
                    break;
                case 4:
                    System.out.println("Você escolheu Dividir.");
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("divisao", a, b));
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