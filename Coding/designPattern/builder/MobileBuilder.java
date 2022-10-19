// 具体构建者的角色，用来构建摩拜单车部件

public class MobileBuilder extends Builder{
    //override
    public void buildFrame() {bike.setFrame("carbon fiber frame");}
    //override
    public void buildSeat() {bike.setSeat("leather seat");}

    //override
    public Bike buildBike() {return bike;}
}