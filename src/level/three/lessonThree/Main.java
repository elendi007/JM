package level.three.lessonThree;

public class Main {
    public static void main(String[] args){
        isPowerOfTwo(722);
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
//        int a = 1;
//        if(value == 0) return false;
//        while (a <= Math.abs(value)){
//            a *= 2;
//        }
//        return a/2 == Math.abs(value);
    }
}
