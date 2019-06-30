using System;

namespace Euclid {

    public class Euclid {

        private Euclid() {}

        public static int gcd(int a, int b) {
            
            int tmp;
            while(b > 0) {
                tmp = b;
                b = a % b;
                a = tmp;
            }

            return a;
        }

        public static (int x, int y) extgcd(int a, int b) {
            // Return x and y in form a*x + b*y
            // x is the inverse of a
            // y is the inverse if b
            // There is only an inverse if gcd(a,b) == 1
            if (a == 0) {
                return (0, 1);
            }else {
                var result = extgcd(b % a, a);
                int ab = (int)Math.Floor((float)b / (float)a);

                result.x = (result.x - ab * result.y);
                result.x = mod(result.x, b);

                return result;
            }
        }

        private static int mod(int a, int b) => ((a%b)+b) % b; 

        public static int moduloInverse(int a, int b) {
            (int x, int y) = extgcd(a, b);
            return x;
        }

    }

}