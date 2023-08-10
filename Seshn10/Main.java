package Seshn10;

public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone("iphone",50000);
        System.out.println(phone.getPrice());
        System.out.println(phone.getName());
        System.out.println( phone.takePhoto());
        System.out.println(phone.sound());
    }
   // Device device=new Device();


}
