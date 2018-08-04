package level.three.lessonOne;

public class Main {
    public static void main(String[] args){
        System.out.println("0: " + booleanExpression(false, false, false, false));
        System.out.println("1: " + booleanExpression(false, false, false, true));
        System.out.println("2: " + booleanExpression(false, false, true, false));
        System.out.println("3: " + booleanExpression(false, false, true, true) + " две истины");
        System.out.println("4: " + booleanExpression(false, true, false, false));
        System.out.println("5: " + booleanExpression(false, true, false, true) + " две истины");
        System.out.println("6: " + booleanExpression(false, true, true, false) + " две истины");
        System.out.println("7: " + booleanExpression(false, true, true, true));
        System.out.println("8: " + booleanExpression(true, false, false, false));
        System.out.println("9: " + booleanExpression(true, false, false, true) + " две истины");
        System.out.println("10: " + booleanExpression(true, false, true, false) + " две истины");
        System.out.println("11: " + booleanExpression(true, false, true, true));
        System.out.println("12: " + booleanExpression(true, true, false, false) + " две истины");
        System.out.println("13: " + booleanExpression(true, true, false, true));
        System.out.println("14: " + booleanExpression(true, true, true, false));
        System.out.println("15: " + booleanExpression(true, true, true, true));
    }

    static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        /* Мой первоначальный варинт
        if((a ^ b) & (c ^ d)) return true;
        if((a ^ c) & (b ^ d)) return true;
        if((a ^ d) & (c ^ b)) return true;
        else return false;*/

        /* Оптимизация Intellij IDEA */
        if((a ^ b) & (c ^ d)) return true;
        return (a ^ c) & (b ^ d);
    }
}
