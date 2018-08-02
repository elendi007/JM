package level.two.lessonTwo;

public class Human {

    private String gender;
    private String name;
    private int age;
    private int growth;
    private int weight;

    public Human(String gender, String name, int age, int growth, int weight) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    public void sayHello(){
        System.out.println(this.name + " говорит: привет!");
    }
}
