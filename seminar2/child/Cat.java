package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;

public class Cat extends Animal implements Speakable, Swimmable, seminar2.parent.Runnable {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        toPlay();
        eat();
        toPlay();
        goToSleep();
    }
    @Override
    public void getSwimSpeed() {
        System.out.println("Кошка может плавать со скоростью до 24.14 км/ч");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("Кошка может бежать до 48 км/ч");
    }
    
}
