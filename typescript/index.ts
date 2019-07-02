import {Euclid} from "./src/Euclid";

const numberList: Array<number> = [0, 1, 2, 3, 4, 5]; 

const b: number = 5;

numberList.forEach(a => {

    const resultGCD: number = Euclid.gcd(a, b);
    console.log("Greatest Common Divisor: ", resultGCD);

    if (resultGCD == 1) {
        const inverse = Euclid.moduloInverse(a, b);
        console.log("inverse of " + a + " mod " + b +" is: " + inverse);
    } else {
        console.log("inverse of " + a + " mod " + b +" is: No Inverse");
    }

    console.log("------------------------------");

});


