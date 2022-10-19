package lambda;

public interface Foo extends Bar, Baz{
    @Override
    default String defaultCommon() {
        String s ="defaultCommon from foo";
        System.out.println(s);
        return s;
    }
}
