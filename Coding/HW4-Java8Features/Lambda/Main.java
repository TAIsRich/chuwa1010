package Java8Features.Lambda;

import org.junit.Test;

public class Main {
    @Test
    public void overrideFoo() {
        Foo foo = new Foo() {
            @Override
            public String method(String string) {
                return string + " From Foo";
            }
        };
        String string = foo.method("Hello");
        System.out.println(string);
    }

    @Test
    public void lambdaFoo() {
        Foo foo = string -> string + " From Foo";
        String string = foo.method("Hello");
        System.out.println(string);
    }

    @Test
    public void lambdaFoo2(){
        Foo foo = string -> string.toUpperCase() + " From Foo";
        String string = foo.method("Hello");
        System.out.println(string);
    }

    @Test
    public void testFinalVariable() {
        final String finalVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + finalVariable;
        };
        System.out.println(foo.method("Hello"));
    }

    @Test
    public void testEffectivelyFinal() {
        //effectively final variable, it is the variable with an unchanged value
        String finalVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + finalVariable;
        };
        System.out.println(foo.method("Hello"));
    }

    @Test
    public void test2() {
        String finalVariable = "Local";
        finalVariable = "LOCAL";

        Foo foo = parameter -> {
            //error: not final variable
            //return parameter + " " + finalVariable;
            return parameter;
        };
        System.out.println(foo.method("Hello"));
    }

// object.set is fine

}
