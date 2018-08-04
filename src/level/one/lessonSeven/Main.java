package level.one.lessonSeven;

public class Main {
    public static void main(String[] args){
        System.out.println("Количество литров воды, которое нужно для наполнения бассейна: "
                + getVolume(25, 5, 2) + " л.");
    }

    public static long getVolume(int a, int b, int c){
        return a * b * c * 1000;
    }
}
