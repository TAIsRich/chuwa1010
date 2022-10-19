package default_static_method;



public class Client {
    public static void main(String[] args) {
        DIMLImp dimlImp = new DIMLImp();
        System.out.println("Override Method"+ dimlImp.add(1,2));
        System.out.println("default method"+dimlImp.subtract(9,2));
        System.out.println("static method"+ DIML.blogName());
    }

}
