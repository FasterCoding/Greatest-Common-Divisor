import {IExtEuclid} from "./iexteuclid";

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

    static extgcd(a: number, b: number): IExtEuclid {
        // Return x and y in form a*x + b*y
        // x is the inverse of a
        // y is the inverse if b
        // There is only an inverse if gcd(a,b) == 1
        if (a == 0) {
            const result: IExtEuclid = {x: 0, y: 1};
            return result;
        }else { 

            let result: IExtEuclid = this.extgcd(b % a, a);
            const ab = Math.floor(b / a);

            result.x = (result.x - ab * result.y);
            result.x = this.mod(result.x, b);

            return result;
        }
    }

    private static mod(a: number, b: number) {
        return ((a%b)+b) % b;
    }

    static moduloInverse(a: number, b: number): number {
        const result: IExtEuclid = this.extgcd(a, b);
        return result.x;
    }

}