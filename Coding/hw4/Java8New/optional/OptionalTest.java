package org.example.Optional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalTest {
    @Test
    public void testOptionalWithNotHandleException() {
        String a = "a";
        Optional<String> optional = Optional.of(a);

//        a = null;
//        //NullPointerException, of does not allow null
//        Optional<String> optional2 = Optional.of(a);
    }

    @Test(expected = NullPointerException.class)
    public void test1() {
        String a = "a";
        Optional<String> optional = Optional.of(a);

        a = null;
        Optional<String> optional2 = Optional.of(a);
    }

    @Test
    //ofNullable allows null
    public void testOfNullable() {
        String a = "a";
        Optional<String> optional = Optional.ofNullable(a);
        System.out.println(optional);//Optional[a]

        a = null;
        Optional<String> optional2 = Optional.ofNullable(a);
        System.out.println(optional2);//Optional.empty
    }

    //orElse(T t) - 如果当前的optional内部封装的t是非空的，则返回内部t, 如果内部的t是空的， 则返回orElse()方法中的t
    @Test
    public void testOrElse() {
        String a = "a";
        Optional<String> optional = Optional.ofNullable(a);
        System.out.println(optional);//Optional[a]

        a = null;
        Optional<String> optional2 = Optional.ofNullable(a);
        System.out.println(optional2);//Optional.empty

        String optional3 = Optional.ofNullable(a).orElse("c");
        System.out.println(optional3);//c
    }
}
