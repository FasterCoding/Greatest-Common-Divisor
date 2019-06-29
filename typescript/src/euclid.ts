export class Euclid {

    static gcd(a: number, b: number): number {
        let tmp: number;
        while (b > 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

}