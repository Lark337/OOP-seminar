// Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). 
// Создать по два класса наследника Animal, умеющих летать, плавать, бегать. 
// В файле readme.md в репозитории github (или ему подобных) описать какие проблемы в таком проектировании Вы увидели, там же написать возникшие при выполнении дз вопросы (если они есть). 
// P.S. Подумать и сделать так, чтобы классы, не умеющие летать, в итоговом коде летать не должны, не плавающие - не плавать, итд

import seminar1.child.Dog;
import seminar1.child.Duck;
import seminar1.child.Owl;
import seminar1.child.Snake;
import seminar1.parent.Animal;
import seminar1.child.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("������", "�����");

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("������", 2);
        System.out.println(duck);
        Dog dog = new Dog("�����", "�����");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(animal);
        animals.forEach(Animal::speak);
        System.out.println("--------�������------------");

        for (Animal a: animals) {
            if (a instanceof Duck) {
                ((Duck) a).fly();
            }
        }
        System.out.println("--------�����------------");

        vaska.hunt();

        
        Owl woo = new Owl("WOolinaq", "black");
        woo.canTheyFly();
        woo.canTheySwim();
        woo.canTheyGo();
        woo.speak();
        Snake selina = new Snake("selina", "black");
        selina.canTheyFly();
        selina.canTheySwim();
        selina.canTheyGo();
        selina.speak();
    }
}
