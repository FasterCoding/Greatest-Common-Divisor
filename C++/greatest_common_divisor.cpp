#include <iostream>

int gcd(int a, int b) {

    if (b == 0) {
        return a;
    } else if (a == 0) {
        return b;
    } else {

        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }

    }
}

int main(int argc, char *argv[]) {

    int a, b;

    std::cout << "Enter a: ";
    std::cin >> a;

    std::cout << "Enter b: ";
    std::cin >> b;

    int greatestCommonDivisor = gcd(a, b);

    std::cout << "Greatest Common Divisor: " << greatestCommonDivisor << std::endl;

    return 0;
}