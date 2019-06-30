using System;
using Euclid;

namespace Euclid {
    class Test {
        static void Main(string[] args) {
            
            int a = 16;
            int b = 24;

            int gcd = Euclid.gcd(a, b);

            Console.WriteLine("Greatest Common Divisor: " + gcd);

            int c = 15;
            int d = 14;

            int gcd2 = Euclid.gcd(c, d);

            Console.WriteLine("Greatest Common Divisor: " + gcd2);
        }
    }
}
