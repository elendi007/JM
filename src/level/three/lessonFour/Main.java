package level.three.lessonFour;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int fact(int n) {
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;

        return result;
    }
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger bigInteger = new BigInteger(Integer.toString(value));
        if(value == 1) return bigInteger = new BigInteger(Integer.toString(value));

        bigInteger = factorial(value - 1).multiply(new BigInteger(Integer.toString(value)));
        return bigInteger;
    }
}