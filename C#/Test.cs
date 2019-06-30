using System;
using Euclid;

namespace Euclid {
    class Test {
        static void Main(string[] args) {
            
            Console.Write("Enter a: ");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter b: ");
            int b = Convert.ToInt32(Console.ReadLine());

            int resultGCD = Euclid.gcd(a, b);

            Console.WriteLine("Greatest Common Divisor: " + resultGCD);

            if (resultGCD == 1) {
                int inverse = Euclid.moduloInverse(a, b);
                Console.WriteLine($"inverse of {a} mod {b} is: {inverse}");
            }else {
                Console.WriteLine($"inverse of {a} mod {b} is: No Inverse");
            }
        }
    }
}
