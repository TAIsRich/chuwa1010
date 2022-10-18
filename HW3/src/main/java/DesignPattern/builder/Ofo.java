package DesignPattern.builder;

public class Ofo extends Builder{
    @Override
    public void buildFrame() {
        bike.setSeat("iron");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("plastic");

    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
