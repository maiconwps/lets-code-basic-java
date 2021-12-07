package com.letscode.basic_java.measurement_converter;

import java.util.Scanner;

public class MeasurementConverter {
    public static final float CONVERSION_FACTOR_INCHES_TO_CM = 2.54f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a medida em polegadas: ");
        float inchesMeasurement = scanner.nextFloat();

        float centimetersMeasurement = inchesMeasurement * CONVERSION_FACTOR_INCHES_TO_CM;

        System.out.printf("A medida inserida é de %.2f cm", centimetersMeasurement);
    }
}
