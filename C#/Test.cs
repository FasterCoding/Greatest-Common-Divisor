using System;
using Euclid;

namespace Euclid {


    class Test {
        static void Main(string[] args) {

            int[] numberList = {0, 1, 2, 3, 4, 5};

            int b = 5;

            foreach (int a in numberList) {
                int resultGCD = Euclid.gcd(a, b);

                Console.WriteLine("Greatest Common Divisor: " + resultGCD);

                if (resultGCD == 1) {
                    int inverse = Euclid.moduloInverse(a, b);
                    Console.WriteLine($"inverse of {a} mod {b} is: {inverse}");
                }else {
                    Console.WriteLine($"inverse of {a} mod {b} is: No Inverse");
                }
                Console.WriteLine("------------------------------");
            }     
        }
    }
}
