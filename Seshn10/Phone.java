package Seshn10;

public class Phone extends Device {
    private int price;

    public Phone(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return super.sound();
    }

    public Phone(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String takePhoto() {
return "this phone can take photo";
    }
}

