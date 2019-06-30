import {Euclid} from "./src/euclid";

const a: number = 16;
const b: number = 24;

const gcd: number = Euclid.gcd(a, b);
console.log("Greatest Common Divisor: ", gcd);

const c: number = 15;
const d: number = 14;

const gcd2: number = Euclid.gcd(c, d);
console.log("Greatest Common Divisor: ", gcd2);