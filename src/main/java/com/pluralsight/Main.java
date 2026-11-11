package com.pluralsight;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float floatTotal = 0.0f;
        double doubleTotal = 0.0;
        BigDecimal bigDecimalTotal = new BigDecimal("0.00");

        BigDecimal amount = new BigDecimal("19.99");

        for (int i = 1; i <= 1000; i++) {
            floatTotal += 19.99f;
            doubleTotal += 19.99;
            bigDecimalTotal = bigDecimalTotal.add(amount);
        }
        System.out.println("Float: " + floatTotal);
        System.out.println("Double: " + doubleTotal);
        System.out.println("Big Decimal: " + bigDecimalTotal);

    }
}
