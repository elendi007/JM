package level.two.lessonThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] array_of_numbers;

        System.out.println("Введите строку целых чисел: ");

        try {
            String entered_string = bufferedReader.readLine();

            if(entered_string.charAt(0) == ',') {
                throw new Exception("Исключение: первый символ не является числом!");
            }

            array_of_numbers = entered_string.split(",");


            StringBuilder evenNumbers = new StringBuilder(); //предназначен для вывода чётных чисел

            for (int i = 0, j = 0; i < array_of_numbers.length; i++) {

                j = Integer.valueOf(array_of_numbers[i]) % 2;

                if(j == 0){
                    evenNumbers.append(Integer.valueOf(array_of_numbers[i]) + " ");
                }
            }

            System.out.println("Чётные числа в введёной строке: " + evenNumbers);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Исключение: В введёной строке присутствуют символы кроме чисел и запятой!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
