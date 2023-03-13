package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Runnable;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;

/**
 * �������� �����, � ������� ����� "�������"  ��������� �� ��������� ��� ��������� � ���������.
 * ����� ������ � ������� ����� � �� ���� � ���� ������� ������� � ����������� :)
 */
public class HumanExtendsAnimal extends Animal implements Speakable, Swimmable, Runnable {
    private final String name;
    private final int legsCount;

    public HumanExtendsAnimal(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s ���-�� �������.%n", getType(), getName());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void getRunSpeed() {
        System.out.println("Человек может бегать со скоростью до 13 км/ч");
    }

    @Override
    public void getSwimSpeed() {
        System.out.println("Человек может плавать со скоростью до 8.6 км/ч");
    }
}
