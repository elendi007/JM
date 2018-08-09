package level.four.lessonTwo.test;

public class Main {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        a.talk();
        b.talk();

        C ab = new A();
        ab.talk();
    }
}
