package seminar1.child;

import seminar1.parent.Animal;

public class Snake extends Animal {
    public Snake(String name, String color){
        super(name,color);
        this.legsCount = 0;
        this.toSwim = true;
    }

    @Override
    public void speak(){
        System.out.println("Speak: Sssspeak");
    }
}
