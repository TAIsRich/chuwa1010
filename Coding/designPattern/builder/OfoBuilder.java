//具体构建者的角色，用来构建ofo单车部件
public class OfoBuilder extends Builder{
    //override
    public void buildFrame() {bike.setFrame("aluminum alloy frame");}

    //override
    public void buildSeat(){bike.setSeat("rubber seat");}

    //override
    public Bike buildBike(){return bike;}
}
