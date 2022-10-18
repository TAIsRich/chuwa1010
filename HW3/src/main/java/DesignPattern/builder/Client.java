package DesignPattern.builder;

public class Client {
    public static void main(String[] args) {
        Director director= new Director(new Mobike());
        Bike bike= director.construct();
        System.out.println(bike.getFrame() );
        System.out.println(bike.getSeat());

    }
}
