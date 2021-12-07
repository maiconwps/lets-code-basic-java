package com.letscode.basic_java.times_table;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha a tabuada: ");
        int factor = scanner.nextInt();

        System.out.print("\nTabuada\n");
        for(int cofactor=1; cofactor<=10; cofactor++){
            System.out.printf("%d x %d = %d \n", factor, cofactor, factor*cofactor);
        }

    }
}