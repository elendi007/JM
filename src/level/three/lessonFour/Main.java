package level.three.lessonFour;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(24));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {

        BigInteger bigInteger = new BigInteger(Integer.toString(value));

        for (int i = value - 1; i >= 1; i--) {
            bigInteger = bigInteger.multiply(new BigInteger(Integer.toString(i)));
        }
        return bigInteger;
    }
}