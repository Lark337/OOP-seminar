package seminar2;
// Создать класс Doctor. Создайте интерфейсы Runnable, Flyable, Swimable. У интерфейсов должны быть
// методы получения скорости заданного действия.
// 
// Добавьте наследников этим интерфейсам, но таким образом,
// чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
// 
// У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих и вообще всех животных.
// 
// Постарайтесь максимально логично переписать архитектуру проекта.

import seminar2.child.Cat;
import seminar2.child.Dog;
import seminar2.child.Duck;
import seminar2.child.HumanExtendsAnimal;
import seminar2.child.Owl;
import seminar2.parent.VeterinaryClinic;
import seminar2.parent.Doctor;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("������", "�����"))
                .addAnimal(new Duck("�������", "������", 2))
                .addAnimal(new Dog("������", "�����"))
                .addAnimal(new HumanExtendsAnimal("����", 2))
                .addAnimal(new Owl("Woolina", "Black"));


        System.out.println("Могут говорить:  " + clinic.getSpeakable());

        System.out.println("Могут летать:\n" +clinic.getFlyable());
        System.out.println();
        System.out.println("Могут плавать:\n" +clinic.getSwimmable());
        System.out.println();
        System.out.println("Могут бегать: " +clinic.getRunnable());
        System.out.println();
        System.out.println("Все животные: " + clinic.getANIMALS());
        System.out.println();
        
        clinic.addDoctor(new Doctor("Alex","Smith"))
              .addDoctor(new Doctor("John", "Doe"));
        System.out.println("Список врачей:\n" + clinic.getDoctors());
        Duck ducky = new Duck("black", 2);
        ducky.getFlySpeed();
        ducky.getRunSpeed();
        ducky.getSwimSpeed();
        
        
    }
}
