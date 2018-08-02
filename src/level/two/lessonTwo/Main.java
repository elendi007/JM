package level.two.lessonTwo;

public class Main {
    public static void main(String[] args){

        Human[] humans = new Human[10];
        humans[0] = new Human("man", "Anton", 20, 180, 80);
        humans[1] = new Human("man", "Denis", 21, 181, 81);
        humans[2] = new Human("man", "Ivan", 22, 182, 82);
        humans[3] = new Human("man", "Artur", 23, 183, 83);
        humans[4] = new Human("man", "Andrey", 24, 184, 84);
        humans[5] = new Human("woman", "Maria", 24, 174, 54);
        humans[6] = new Human("woman", "Anna", 23, 173, 53);
        humans[7] = new Human("woman", "Tanya", 22, 172, 52);
        humans[8] = new Human("woman", "Olga", 21, 171, 51);
        humans[9] = new Human("woman", "Irina", 20, 170, 50);

        for (int i = 0; i < humans.length; i++) {
            humans[i].sayHello();
        }
    }
}
