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

        result = Euclid.gcd(a,b);

        System.out.println("Greatest Common Divisor: " + result);
    }
}
