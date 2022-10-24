package java8_features.lambda;

@FunctionalInterface
public interface Foo extends Baz, Bar {
    @Override
    default String defaultCommon() {
        String s = "defaultCommon from Foo";
        System.out.println(s);
        return s;
    }
}
