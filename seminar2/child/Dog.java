package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Runnable;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;

public class Dog extends Animal implements Speakable, Runnable, Swimmable {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        toPlay();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public void getRunSpeed() {
        System.out.println("Собака может бежать со скоростью до 35 км/ч ");
    }

    @Override
    public void getSwimSpeed() {
        System.out.println("Собака может плавать со скорость до 3.22 км/ч");
    }
}
