package seminar1.parent;

public class Animal {
    private String name;
    private final String color;
    protected int legsCount;
    protected boolean toFly;
    protected boolean toGo;
    protected boolean toSwim;

    public Animal(String name, String color, int legsCount, boolean toFly, boolean toGo, boolean toSwim) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;
        this.toFly = toFly;
        this.toGo = toGo;
        this.toSwim = toSwim;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
        this.toFly = false;
        this.toGo = false;
        this.toSwim = false;
    }

    public Animal(String color, int legsCount) {
        this("����������", color);
        this.legsCount = legsCount;
    }

    public Animal() {
        this("����������", "������");
    }

    // todo: ���� ������, ���������� �� ��������� �������.
    //  !!!�������� �������� �� ������ ������� ������ ����� � sysout java

//    public void wakeUp() {
//        System.out.println(getType() + ": ���������");
//    }
//
//    public void findFood() {
//        String out = String.format("%s: ����� ���%n", getType());
//        System.out.println(out);
//    }
//
//    public void eat() {
//        System.out.printf("%s: ����%n", getType());
//    }
//
//    public void toPlay() {
//        System.out.printf("%s: �������%n", getType());
//    }
//
//    public void goToSleep() {
//        System.out.printf("%s: �����%n", getType());
//    }

    public void speak() {
        System.out.printf("%s: ...%n", getType());
    }

    public void hunt() {}

    //todo: ���� ������� � �������. !!! �������� ��������, �� � ������� ���� ���� ������(���� �� ����� ������������)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
    

    public void canTheyFly (){
        if (toFly){
            System.out.println(getName() + " Can fly");
        }
        else{
            System.out.println(getName() + " Can't fly");
        }
    }
    public void canTheyGo (){
        if (toGo){
            System.out.println(getName() + " Can run");
        }
        else{
            System.out.println(getName() + " Can't run");
        }
    }
    public void canTheySwim (){
        if (toSwim){
            System.out.println( getName() +" Can swim");
        }
        else{
            System.out.println(getName() + " Can't swim");
        }
    }
}
