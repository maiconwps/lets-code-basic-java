package com.letscode.basic_java.calculator;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int number1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int number2 = scanner.nextInt();

        System.out.println("-----------Resultado----------");
        System.out.printf("Soma: %d \n", number1 + number2);
        System.out.printf("Subtração: %d \n", number1 - number2);
        System.out.printf("Multiplicação: %d \n", number1 * number2);
        System.out.printf("Divisão: %d \n", number1 / number2);
    }
}
