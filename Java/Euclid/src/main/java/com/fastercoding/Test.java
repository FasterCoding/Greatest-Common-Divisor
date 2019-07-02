package com.fastercoding;

import java.util.Scanner;
import com.fastercoding.euclid.Euclid;

public class Test {

    public static void main(String[] args) {

        int[] numberList = {0, 1, 2, 3, 4, 5};
        int b = 5;

        for (int a : numberList) {
            int resultGCD = Euclid.gcd(a,b);

            System.out.println("Greatest Common Divisor: " + resultGCD);

            if (resultGCD == 1) {
                int inverse = Euclid.moduloInverse(a, b);
                System.out.println("Inverse of " + String.valueOf(a) + " mod " + String.valueOf(b) + " is: " + String.valueOf(inverse));
            } else {
                System.out.println("Inverse of " + String.valueOf(a) + " mod " + String.valueOf(b) + " is: No Inverse");
            }

            System.out.println("------------------------------");
        }
        
    }
}
