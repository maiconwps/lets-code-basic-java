package com.letscode.basic_java.temperature_convert;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o temperatura em Celsius: ");
        float celsiusTemperature = scanner.nextFloat();

        float farenheitTemperature = celsiusTemperature*1.8f + 32.0f;

        System.out.printf("A temperatura em graus Farenheit é %.2f °F", farenheitTemperature);
    }
}
