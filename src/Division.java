public class Division {
    public static int diviser(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro interdite !");
        }
        return a / b;
    }
}
