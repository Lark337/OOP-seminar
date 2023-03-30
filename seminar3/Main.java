package seminar3;

import seminar3.drugstore.Drug;
import seminar3.drugstore.IterableDrug;
import seminar3.drugstore.components.Component;
import seminar3.drugstore.components.child.Azitronite;
import seminar3.drugstore.components.child.Penicillin;
import seminar3.drugstore.components.child.Water;
import seminar3.drugstore.drug.CatDrug;
import seminar3.drugstore.drug.DogDrug;
import seminar3.parent.VeterinaryClinic;
import seminar3.personal.Company;
import seminar3.personal.Doctor;
import seminar3.personal.HeadPhysician;
import seminar3.personal.Nurse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Iterator-------------");
        Drug dogDrug = new DogDrug();
        dogDrug.addComponent(new Water("������� ����", "200 ��", 1));
        dogDrug.addComponent(new Penicillin("����������", "10 ��", 10));

        while (((Iterator<Component>) dogDrug).hasNext()) {
            System.out.println(((Iterator<Component>) dogDrug).next());
        }

//        System.out.println("-------------���������� � ������-��������-------------");
//        dogDrug.getComponents();

        System.out.println("-------------Iterable-------------");

        IterableDrug catDrug = new CatDrug();
        catDrug.addComponent(new Water("������ ����", "150 ��", 2));
        catDrug.addComponent(new Azitronite("���������", "5 ��", 20));

        for (Component component: catDrug) {
            System.out.println(component);
        }

        System.out.println("-------------Comparable-------------");

        IterableDrug catDrug1 = new CatDrug();
        IterableDrug catDrug2 = new CatDrug();
        IterableDrug catDrug3 = new CatDrug();
        IterableDrug catDrug4 = new CatDrug();

        catDrug1.addComponent(new Water("������ ����", "150 ��", 2));
        catDrug1.addComponent(new Azitronite("����� ���������", "5 ��", 30));

        catDrug2.addComponent(new Water("������ ����", "150 ��", 2));
        catDrug2.addComponent(new Azitronite("���� ���������", "5 ��", 15));

        catDrug3.addComponent(new Water("������ ����", "150 ��", 2));
        catDrug3.addComponent(new Azitronite("���������", "5 ��", 20));

        List<IterableDrug> drugs = new ArrayList<>();
        drugs.add(catDrug);
        drugs.add(catDrug1);
        drugs.add(catDrug2);
        drugs.add(catDrug3);

        System.out.println("�� ����������: ");
        System.out.println(drugs);
        System.out.println();
        System.out.println("����� ����������: ");
        Collections.sort(drugs);
        System.out.println(drugs);
        System.out.println();

        System.out.println("-------------Personal-------------");
        System.out.println();
        HeadPhysician headPhysician = new HeadPhysician("Ivan", "Ivanov");
        Doctor petr = new Doctor("Petr", "Petrov");
        Doctor semen = new Doctor("Semen", "Semenov");

        Nurse nadya = new Nurse("Nadejda", "Nadejdova");
        Nurse olga = new Nurse("Olga", "Ivanova");
        Nurse sasha = new Nurse("Sasha", "Petrova");
        Nurse mariya = new Nurse("Mariya", "Semenova");

        headPhysician.addSubordinate(petr).addSubordinate(semen);
        semen.addSubordinate(nadya).addSubordinate(olga);
        petr.addSubordinate(sasha).addSubordinate(mariya);

        VeterinaryClinic clinic = new VeterinaryClinic(headPhysician);

        clinic.forEach(System.out::println);

        System.out.println("---------------------------------");

        //todo
        // ��: 1.������� ���, ����� ����� ���������� ���� ����, � ���� result ���� ������ ��� ���������� �������
        // IterableDrug.
        // 2. ���������� compareTo ���, ����� ���� power �������� �����, ��������� ��� ��� �
        // �� ��������� ����������� ���������
        Set<IterableDrug> result = new HashSet<>(drugs);
        System.out.println(result.size()); // ��� ����� ������ ���� ����� 3, � �� 4!

        catDrug4.addComponent(new Water("keks", "150 ", 2));
        catDrug4.addComponent(new Water("keksik", "150 ", 2));
        
        System.out.println(catDrug4);

        System.out.println(catDrug1.compareTo(catDrug2));

        Set <Component> d1 = new HashSet<>();
        d1.add(new Water("keksik", "150 ", 2));
        d1.add(new Water("keksik", "150 ", 2));
        System.out.println(d1);
    }
}
