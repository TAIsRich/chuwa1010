package src.main.java.default_static_method;



public class Client {
    public static void main(String[] args) {
        default_static_method.DIMLImp dimlImp = new default_static_method.DIMLImp();
        System.out.println("Override Method"+ dimlImp.add(1,2));
        System.out.println("default method"+dimlImp.subtract(9,2));
        System.out.println("static method"+ default_static_method.DIML.blogName());
    }

}
