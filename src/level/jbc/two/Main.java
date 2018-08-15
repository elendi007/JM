package level.jbc.two;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.voice();

        Animal wolf = new Wolf();
        wolf.voice();

        Cat cat = new Cat();
        cat.meow();
        cat.meow("Murzik");
    }
}
