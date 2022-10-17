package builder;

public abstract class Builder {
    // separate complicated construction process
    // build the object step-by-step and provide a method that will actually return the final Object

    //builder, concretebuilder, product, director

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
