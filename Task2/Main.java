package Seshn10.Task2;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger",15, 25);
        Tiger tiger1 = new Tiger("Tiger",18, 30);
        Gepard Gepard1 = new Gepard("Leopard", 10,18);
        Gepard Gepard = new Gepard("Leopard", 10,10);
        Wolf wolf = new Wolf("Wolf", 8,15);


        Beast[] beasts = {tiger, Gepard, wolf,tiger1,Gepard1};

        for (Beast beastss : beasts) {
            if(beastss.getSpeed()>=10){
                System.out.println(beastss);
            }

        }

    }
}
