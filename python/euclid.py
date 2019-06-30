def gcd(a, b):
    while (b > 0):
        a, b = b, a % b
    
    return a

def extgcd(a, b):
    # Return in form a*x + b*y
    # x is the inverse of a
    # y is the inverse if b
    # There is only an inverse if gcd(a,b) == 1
    if a == 0:
        return (0, 1)
    else:
        y, x = extgcd(b % a, a)
        return ((x - (b // a) * y) % b, y)

def moduloInverseOf(a, b):
    inv = extgcd(a, b)
    return inv[0]

if __name__ == "__main__":
    
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))

    resultGCD = gcd(a,b)
    
    inverse = "No Inverse"
    if resultGCD == 1:
        inverse = moduloInverseOf(a, b)

    print("Greatest Common Divisor: ", resultGCD)
    print("Inverse of " + str(a) + " mod " + str(b) + " is: ", inverse)
