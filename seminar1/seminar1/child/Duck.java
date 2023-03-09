package seminar1.child;

import seminar1.parent.Animal;

public class Duck extends Animal {
    public Duck(String color, int legsCount) {
        super(color, legsCount);
        this.toFly = true;
        this.toSwim = true;
        this.toGo = true;
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }

    public void fly() {
        System.out.printf("%s �������!%n", getType());
    }
}
