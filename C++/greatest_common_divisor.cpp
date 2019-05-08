#include <iostream>

int gcd(int a, int b) {

    int result;

    if (b == 0) {
        return a;
    } else if (a == 0) {
        return b;
    } else {

        if (a > b) {
            result = gcd(a - b, b);
        } else {
            result = gcd(a, b - a);
        }

    } 

    return result;
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