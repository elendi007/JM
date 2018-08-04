package level.two.lessonThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        String[] array = string.split(",");

            for (int i = 0; i < array.length; i++) {

                if(Integer.valueOf(array[i]) % 2 == 0){
                    System.out.println("Четные числа: " + array[i]);
                }
            }
    }
}
