package org.example.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class LambdaLearn {

    @Test
    public  void overrideFoo(){
        Foo fooByIC = new Foo() {
            @Override
            public String method(String string) {
                return string + " from foo";
            }
        };

        String hello = fooByIC.method("Hello");
        System.out.println(hello);
        fooByIC.defaultBaz();
    }

    @Test
    public void lambdaFoo(){
        Foo foo = parameter -> parameter + " from Foo";

        String hello = foo.method("Hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo2(){
        Foo foo = parameter -> parameter.toUpperCase() + " from Foo.";

        String hello = foo.method("Hello");
        System.out.println(hello);
    }

    @Test
    public void testOverload() throws Exception{
        Processor p = new ProcessorImpl();
        String result = p.process((Callable<String>)() -> "ad");

        String resultb = p.process((Supplier<String>)() -> "ad");

        System.out.println(result);
        System.out.println(resultb);
    }

    @Test
    public void testFinal(){
        final String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };

        System.out.println(foo.method("hello"));
    }

    //by default, no change variable is thought to be final
    //which could be used by lambda
    @Test
    public void testEffectivelyFinal(){
        String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };

        System.out.println(foo.method("hello"));
    }

    @Test
    public void testFinal2(){
        String localVariable = "Local";
        // variable changed: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
        localVariable = "LOCAL";
        Foo foo = parameter -> {
            return parameter;
            //return parameter + " " + localVariable;
        };

        System.out.println(foo.method("hello"));
    }


    //setter is not considered as changing variable
    //and the set result will be returned
    @Test
    public void testFinal3(){
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("b");
        a.add("c");
        a.set(0,"a");
        Foo foo = parameter -> {;
            return parameter + " " + a.get(0).toString();
        };

        System.out.println(foo.method("hello"));
    }





}
