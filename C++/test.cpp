#include <iostream>

#include "euclid.hpp"

int main(int argc, char const *argv[]) {

    int numberList[] = {0, 1, 2, 3, 4, 5};
    int b = 5;

    int resultGCD;
    int inverse;

    for (int a: numberList) {

        resultGCD = Euclid::gcd(a, b);
        std::cout << "Greatest Common Divisor: " << resultGCD << std::endl;

        inverse = 0;

        if (resultGCD == 1) {
            inverse = Euclid::moduloInverseOf(a, b);
            std::cout << "Inverse of " << a << " mod " << b << " is: " << inverse << std::endl;
        } else {
            std::cout << "Inverse of " << a << " mod " << b << " is: No Inverse" << std::endl;
        }

        std::cout << "------------------------------" << std::endl;
    }

    

    return 0;
}
