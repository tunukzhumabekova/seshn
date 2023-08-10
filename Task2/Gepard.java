package Seshn10.Task2;

public class Gepard extends Beast{
    private int weight;

    public Gepard(String name, int speed,int weight) {
        super(name, speed);
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

