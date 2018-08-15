package level.jbc.two.polimorf;

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Cat screams");
    }

    public void meow(){
        System.out.println("Cat meow");
    }

    public void meow(String name){
        System.out.println(name + " meow");
    }
}
