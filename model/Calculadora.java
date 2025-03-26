package model;

import java.util.Scanner;

public class Calculadora {
    double a;
    double b;
    Scanner scanner;
       
    public double somar() {
        //escolher valores
        
        return a + b;
    }
    
    public double subtrair() {
        scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scanner.nextDouble();
        return a - b;
    }
    
    public double multiplicar() {
        scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scanner.nextDouble();
     
        return a * b;
    }
    
    public double dividir() {
        scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scanner.nextDouble();
        return a / b;
    }
}
