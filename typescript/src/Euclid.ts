import {IExtEuclid} from "./IExtEuclid";

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

            const result: IExtEuclid = this.extgcd(b % a, a);
            const ab = Math.floor(b / a);

            const x: number = (result.y - ab * result.x);
            const y: number = result.x;
            
            return {x: x, y: y};
        }
    }

    private static mod(a: number, b: number) {
        return ((a%b)+b) % b;
    }

    static moduloInverse(a: number, b: number): number {
        const result: IExtEuclid = this.extgcd(a, b);
        return this.mod(result.x, b);;
    }

}