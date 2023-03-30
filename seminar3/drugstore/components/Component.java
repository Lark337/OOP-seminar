package seminar3.drugstore.components;

public abstract class Component {
    private final String name;
    private final String weight;
    private final int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s, weight: %s, power: %s}", this.getClass().getSimpleName(), name, weight, power
        );
    }
    @Override
    public int hashCode() {
        int num;
        num = 31 * name.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        Component comp = (Component) obj;
        Component comp2 = (Component) this;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (comp.getName() == comp2.getName()) return true;
        return false;
    }

    


}
