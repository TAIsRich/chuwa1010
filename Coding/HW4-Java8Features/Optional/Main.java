package Java8Features.Optional;

import org.junit.Test;
import resources.Employee;

import java.util.Optional;

public class Main {
    //Optional.of()
    @Test(expected = NullPointerException.class)
    public void test_of() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        // of(T t) - can not be null
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void test_ofNullable() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);
        employee = null;
        // of(T t) - can not be null
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);

    }

    @Test
    public void test_OrElse() {
        Employee employee = new Employee();
        // remember type is not Optional, it is Employee
        Optional optional = Optional.ofNullable(employee);
        Employee result = (Employee) optional.orElse(new Employee(1, "JCole", 30, 6666));
        //Employee result = Optional.ofNullable(employee).orElse(new Employee(1, "JCole", 30, 6666));
        System.out.println(result);
    }
}
