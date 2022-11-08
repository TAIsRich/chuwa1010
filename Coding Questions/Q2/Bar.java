package hw4.Q2.lambda;

@FunctionalInterface
public interface Bar {
    String method(String s);

    default String defaultBar() {
        String s = "default Bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon() {
        String s = "defaultCommon from Bar";
        System.out.println(s);
        return s;
    }
}
