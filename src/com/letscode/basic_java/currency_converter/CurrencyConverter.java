package com.letscode.basic_java.currency_converter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a cotação do dólar em R$? ");
        float dollarQuote = scanner.nextFloat();

        System.out.print("Qual valor em R$ vc deseja converter? ");
        float realValue = scanner.nextFloat();

        float dollarValue = realValue / dollarQuote;

        System.out.printf("O valor de R$ %.2f em dólars é de $ %.2f.", realValue, dollarValue);

    }
}
