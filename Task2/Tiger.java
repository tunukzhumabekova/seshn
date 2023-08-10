package Seshn10.Task2;

public class Tiger extends Beast{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Tiger(String name, int speed, int weight) {
        super(name, speed);
        this.weight=weight;

    }
}
