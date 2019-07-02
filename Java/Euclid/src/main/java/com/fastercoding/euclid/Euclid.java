package com.fastercoding.euclid;

import java.util.Collection;

public class Euclid {

    private Euclid() {}

    public static int gcd(int a, int b) {
        
        int tmp;
        while (b > 0) {
            tmp = b;  
            b = a % b;
            a = tmp;
        }

        return a;
    }

    public static int[] extgcd(int a, int b) {
        // Return x and y in form a*x + b*y
        // x is the inverse of a
        // y is the inverse if b
        // There is only an inverse if gcd(a,b) == 1
        if (a == 0) {
            return new int[]{0, 1};
        }else {
            int[] result = extgcd(b % a, a);
            int ab = (int)Math.floor(b / a);

            int x = (result[1] - ab * result[0]);
            int y = result[0];

            return new int[]{x,y};
        }
    }

    private static int mod(int a, int b) {
        return ((a%b)+b) % b;
    }

    public static int moduloInverse(int a, int b) {
        int[] result = extgcd(a, b);
        return mod(result[0], b);
    }
}
