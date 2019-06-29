#include <iostream>

#include "euclid.hpp"

int main(int argc, char const *argv[]) {
    
    int a, b;

    std::cout << "Enter a: ";
    std::cin >> a;

    std::cout << "Enter b: ";
    std::cin >> b;

    int greatestCommonDivisor = Euclid::gcd(a, b);

    std::cout << "Greatest Common Divisor: " << greatestCommonDivisor << std::endl;


    return 0;
}
