package level.one.lessonEight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Квадрат считанного числа равен: " + (a * a));
    }
}
