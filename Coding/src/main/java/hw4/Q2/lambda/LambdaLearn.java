package hw4.Q2.lambda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.core.Processor;

import java.util.concurrent.Callable;

public class LambdaLearn {
    @Test
    public void overrideFoo() {
        Foo fooByIC = new Foo() {
            @Override
            public String method(String s) {
                return s + " from Foo";
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
        Foo foo = parameter -> parameter.toUpperCase() + " from foo";
        String hello = foo.method("hello");
        System.out.println(hello);
    }

//    @Test
//    public void testOverload() throws Exception {
//        Processor processor = new ProcessorImpl();
//        String result = processor.process(() -> "abc");
////        String result = processor.process((Callable<String>) () -> "abc");
//    }

    @Test
    public void testFinal() {
        final String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };
        System.out.println(foo.method("hello"));
    }

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
        localVariable = "LOCAL";
        Foo foo = parameter -> {
            return parameter;
        };
        System.out.println(foo.method("hello"));
    }
}
