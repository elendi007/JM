package level.two.lessonOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = scanner.nextLine();
        System.out.println("количество символов в строке: " + a.length());
        System.out.println("введёная строка: " + a + " java");
    }
}
