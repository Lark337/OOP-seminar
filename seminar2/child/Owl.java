package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Flyable;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;

public class Owl extends Animal implements Speakable, Flyable, Swimmable {
    public Owl(String name, String color){
        super(name,color);
    }

    @Override
    public void speak() {
        System.out.println("Hoo hoo");;
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    @Override
    public void getFlySpeed() {
        System.out.println("Совы летает до 40 км/ч");
    }
    @Override
    public void getSwimSpeed() {
        System.out.println("Совы плавают со скоростью 10 км/ч");
    }
}
