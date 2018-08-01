package level.one.lessonNine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите строку: ");

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        System.out.println("\nСтрока которую вы ввели:\n" + line);
    }
}
