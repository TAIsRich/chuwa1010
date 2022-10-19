package lambda;

import org.junit.Test;


public class LambdaLearn {


    @Test
    public void overrideFoo() {

        Foo fooByIC = new Foo() {
            @Override
            public String method(String string) {
                return string + " from Foo";
            }
        };
        String hello = fooByIC.method("hello");
        System.out.println(hello);
        fooByIC.defaultBaz();
    }

    @Test
    public void lambdaFoo() {
        Foo foo = parameter -> parameter + " from Foo";

        String hello = foo.method("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo2() {
        Foo foo = parameter -> parameter.toUpperCase() + " from Foo";

        String hello = foo.method("hello");
        System.out.println(hello);
    }


    @Test
    public void testFinal() {
        final String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };

        System.out.println(foo.method("hello"));
    }
    /**
     * Use “Effectively Final” Variables
     * 当variable只赋值一次，没有任何变动的时候，Java默认是final。
     */
    @Test
    public void testEffectivelyFinal() {
        String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };

        System.out.println(foo.method("hello"));
    }

    @Test
    public void testFinal2() {
        String localVariable = "Local";
        localVariable = "LOCAL"; // 新的内存地址

        Foo foo = parameter -> {

            return parameter;
        };

        System.out.println(foo.method("hello"));
    }





}
