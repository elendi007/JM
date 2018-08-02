package level.two.lessonFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Введите четыре числа! \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double c = scanner.nextDouble();

        System.out.print("Введите четвёртое число: ");
        double d = scanner.nextDouble();

        System.out.println("\nНаименьшее число из введёных: " + getSmallNumberFromTheFour(a,b,c,d));

    }

    static double getSmallNumberFromTheSecond(double a, double b){
        return (a > b)? b : a;
    }

    static double getSmallNumberFromTheFour(double a, double b, double c, double d){

        double i1 = getSmallNumberFromTheSecond(a, b);
        double i2 = getSmallNumberFromTheSecond(c, d);

        return (i1 > i2)? i2 : i1;
    }
}
