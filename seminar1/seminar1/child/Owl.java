package seminar1.child;

import seminar1.parent.Animal;

public class Owl extends Animal {
    public Owl(String name, String color){
        super(name,color);
        this.toFly = true;
        this.legsCount = 2;
        this.toSwim = true;
    }

    @Override
    public void speak(){
        System.out.println("Speak: woo woo");
    }
}
