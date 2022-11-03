package Lambda;

@FunctionalInterface
public interface Foo extends Bar, Baz{


    @Override
    default String defaultCommon() {
//        return Bar.super.defaultCommon();
        String s = "defaultCommon from Foo";
        System.out.println(s);
        return s;
    }
}
