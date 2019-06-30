namespace Euclid {

    public class Euclid {

        private Euclid() {}

        public static int gcd(int a, int b) {
            
            int tmp;
            while(b > 0) {
                tmp = b;
                b = a % b;
                a = tmp;
            }

            return a;
        }

    }

}