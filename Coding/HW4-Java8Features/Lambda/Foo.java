package Java8Features.Lambda;
@FunctionalInterface
public interface Foo extends Baz, Bar{

    @Override
    default String defaultCommon() {
        String s = "defaultCommon from Foo";
        System.out.println(s);
        return s;
    }
}
