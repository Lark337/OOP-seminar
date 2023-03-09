package seminar1.child;

import seminar1.parent.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
        this.toSwim = true;
        this.toGo = true;
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }
}
