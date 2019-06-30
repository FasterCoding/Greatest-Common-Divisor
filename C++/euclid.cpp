#include "euclid.hpp"

int Euclid::gcd(int a, int b) {
    
    int tmp;
    while (b > 0) {
        tmp = b;
        b = a % b;
        a = tmp;
    }

    return a;
}

std::tuple<int, int> Euclid::extgcd(int a, int b) {
    // Return in x and y form a*x + b*y
    // x is the inverse of a
    // y is the inverse if b
    // There is only an inverse if gcd(a,b) == 1
    if (a == 0) {
        return std::make_tuple(0, 1);
    }else {
        std::tuple<int, int> result = extgcd(b % a, a);
        int y = std::get<1>(result);
        int x = (x - int(b / a) * y) % b;

        return std::make_tuple(x, y);
    }
}

int Euclid::moduloInverseOf(int a, int b) {
    std::tuple<int, int> inv = extgcd(a, b);
    return std::get<0>(inv);
}