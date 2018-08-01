package level.one.lessonFive;

public class Main {
    public static void main(String[] args){

        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium){

        return celsium * 9/5 + 32;
    }
}
