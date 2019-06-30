#include <iostream>

#include "euclid.hpp"

int main(int argc, char const *argv[]) {
    
    int a, b;

    std::cout << "Enter a: ";
    std::cin >> a;

    std::cout << "Enter b: ";
    std::cin >> b;

    int resultGCD = Euclid::gcd(a, b);
    std::cout << "Greatest Common Divisor: " << resultGCD << std::endl;

    int inverse = 0;

    if (resultGCD == 1) {
        inverse = Euclid::moduloInverseOf(a, b);
        std::cout << "Inverse of " << a << " mod " << b << " is: " << inverse << std::endl;
    } else {
        std::cout << "Inverse of " << a << " mod " << b << " is: No Inverse" << std::endl;
    }

    return 0;
}
