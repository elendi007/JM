package level.jbc.one.test;

public class Main {
    public static void main(String[] args){
        int [] a = new int [2];
        int [] b = new int [3];

        System.arraycopy(a,0, b, 0 , a.length);

    }
}
