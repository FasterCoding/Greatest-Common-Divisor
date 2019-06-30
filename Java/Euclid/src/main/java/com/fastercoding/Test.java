package com.fastercoding;

import java.util.Scanner;
import com.fastercoding.euclid.Euclid;

public class Test {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int result = 0;


        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a: ");
            a = scanner.nextInt();

            System.out.print("Enter b: ");
            b = scanner.nextInt();
            
        }catch (Exception ex) {
            System.out.println(ex);
        }

        int resultGCD = Euclid.gcd(a,b);

        System.out.println("Greatest Common Divisor: " + resultGCD);

        if (resultGCD == 1) {
            int inverse = Euclid.moduloInverse(a, b);
            System.out.println("Inverse of " + String.valueOf(a) + " mod " + String.valueOf(b) + " is: " + String.valueOf(inverse));
        } else {
            System.out.println("Inverse of " + String.valueOf(a) + " mod " + String.valueOf(b) + " is: No Inverse");
        }
    }
}
