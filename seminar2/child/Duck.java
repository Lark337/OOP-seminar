package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Flyable;
import seminar2.parent.Runnable;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;

public class Duck extends Animal implements Speakable, Swimmable, Flyable, Runnable {
    private int legsCount;

    public Duck(String name, String color, int legsCount) {
        super(name, color);
        this.legsCount = legsCount;
    }

    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    public void fly() {
        System.out.printf("%s �������!%n", getType());
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }
    
    
    @Override
    public void getSwimSpeed() {
        System.out.println("Утка может плавать со скоростью 112км/ч" );
    }

    @Override
    public void getFlySpeed() {
        System.out.println("Утка может летать со скоростью до 90 км/ч");
    }
    @Override
    public void getRunSpeed() {
        System.out.println("Утка бегает со скоростью до 11 км/ч");
    }
}
