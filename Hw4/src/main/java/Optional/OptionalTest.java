package Optional;

import org.junit.Test;
import streamApi.Employee;

import java.util.Optional;

public class OptionalTest {
    @Test()
    public void testOptionalWithNotHandleException() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        // of(T t) - 不可以为null
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test(expected = NullPointerException.class)
    public void test1() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        // of(T t) - 不可以为null
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void testOfNullable() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);
    }

    @Test
    public void testOrElse() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);

        // remember type is not Optional, it is streamApi.Employee
        Employee optional3 = Optional.ofNullable(employee).orElse(new Employee(1, "JCole", 30, 6666));
        System.out.println(optional3);
    }
}
