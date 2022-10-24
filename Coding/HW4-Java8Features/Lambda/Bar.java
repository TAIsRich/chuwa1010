package Java8Features.Lambda;
@FunctionalInterface
public interface Bar {
    //only one abstract method
    String method(String string);

    //can have a lot of default methods
    default String defaultBar() {
        String s = "default Bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon(){
        String s = "defaultCommon from Bar";
        System.out.println(s);
        return s;
    }
}
