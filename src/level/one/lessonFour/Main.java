package level.one.lessonFour;

public class Main {
    public static void main(String[] args){
        printCircleLength(5);
    }

    static void printCircleLength(double radius){
        double Pi = 3.14;
        double L = 2 * Pi * radius;
        System.out.println("Длина окружности радиусом: " + radius + " равна: " + L);
    }
}
