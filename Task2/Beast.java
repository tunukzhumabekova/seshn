package Seshn10.Task2;

public class Beast {
    private String name;

private int speed;
public Beast(){

}
    public Beast(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Beast{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}