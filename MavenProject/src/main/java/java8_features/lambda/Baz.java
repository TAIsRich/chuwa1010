package java8_features.lambda;

public interface Baz {
    default String defaultBaz() {
        String s = "default Baz method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon() {
        String s = "defaultCommon from Baz";
        System.out.println(s);
        return s;
    };
}
