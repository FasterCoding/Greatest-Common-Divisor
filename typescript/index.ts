import {Euclid} from "./src/Euclid";

const a: number = 4;
const b: number = 5;

const resultGCD: number = Euclid.gcd(a, b);
console.log("Greatest Common Divisor: ", resultGCD);

if (resultGCD == 1) {
    const inverse = Euclid.moduloInverse(a, b);
    console.log("inverse of " + a + " mod " + b +" is: " + inverse);
} else {
    console.log("inverse of " + a + " mod " + b +" is: No Inverse");
}
