
def gcd(a, b):

    if b == 0:
        return a
    elif a == 0:
        return b
    else:

        if a > b:
            return gcd(a - b, b)
        else: 
            return gcd(a, b - a)


if __name__ == "__main__":
    
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))

    result = gcd(a,b)

    print("Greatest Common Divisor: ", result)
