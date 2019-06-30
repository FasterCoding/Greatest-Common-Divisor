def gcd(a, b):
    while (b > 0):
        a, b = b, a % b
    
    return a

if __name__ == "__main__":
    
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))

    result = gcd(a,b)

    print("Greatest Common Divisor: ", result)