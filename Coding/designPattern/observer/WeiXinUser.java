public class WeiXinUser implements Observer{
    private String name;
    public WeiXinUser(String name){
        this.name=name;
    }

    public ovid update(String message){
        System.out.println(name + "-"+ message);
    }
}