import java.lang.Exception;
import java.util.Scanner;


public class GreatesCommonDivisor { 

    public static void main(String[] args){ 

        int a = 0;
        int b = 0;
        int result = 0;
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a: ");
            a = scanner.nextInt();

            System.out.print("Enter b: ");
            b = scanner.nextInt();
            
        }catch (Exception ex) {
            System.out.println(ex);
        }

        result = gcd(a,b);

        System.out.println("Greatest Common Divisor: " + result);

    } 

    private static int gcd(int a, int b) {

        if (b == 0){
            return a;
        }else if (a == 0){
            return b;
        } else {

            if (a > b) {
                return gcd(a - b, b);
            }else {
                return gcd(a, b - a);
            }

        }
    }

}