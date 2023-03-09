package seminar1.child;

import seminar1.parent.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
        this.toSwim = true;
        this.toGo = true;
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    private void wakeUp() {
        System.out.println(getType() + ": ���������");
    }

    private void findFood() {
        String out = String.format("%s: ����� ���%n", getType());
        System.out.println(out);
    }

    private void eat() {
        System.out.printf("%s: ����%n", getType());
    }

    private void toPlay() {
        System.out.printf("%s: �������%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: �����%n", getType());
    }

}
