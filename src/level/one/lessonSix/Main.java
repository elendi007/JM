package level.one.lessonSix;

public class Main {
    public static void main(String[] args){

        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds){

        return seconds - (seconds / 3600) * 3600;
    }
}


// в сутках 86_400 с
// в часе 3_600 с