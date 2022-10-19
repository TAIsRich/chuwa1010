package builder;

public class Director{
    //声明Builder类型的变量
    private Builder builder;

    public Director(Builder builder){ this.builder = builder;}

    //构造自行车：orgnize部件构建的order
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.buildBike();
    }
}