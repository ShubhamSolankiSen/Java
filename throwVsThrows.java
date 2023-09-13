
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        // return super.toString() + " i am toString() "; --> super thrown null value
        return " Radius cannot be String:";
    }

    @Override
    public String getMessage() {
        // return super.getMessage() + " I am getMessage() ";
        return " Radius cannot be String: ";
    }

    public class throwVsThrows {
        public static double area(int r) throws NegativeRadiusException {
            if (r < 0) {
                throw new NegativeRadiusException();
            }
            double result = Math.PI * r * r;
            return result;
        }

        public static int divide(int a, int b) throws ArithmeticException {
            int result = a / b;
            return result;
        }

        public static void main(String[] args) {
            try {
                int c = divide(4, 2);
                System.out.println(c);
                double ar = area(3);
                System.out.println(ar);

            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
}