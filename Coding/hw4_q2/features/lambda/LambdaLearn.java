import com.chuwa.tutorial.t00_common.pojos.Employee;
import com.chuwa.tutorial.t00_common.utils.EmployeeData;
import org.junit.Test;

import java.util.List;

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
    public void testOverload() throws Exception {
        Processor processor = new ProcessorImpl();
    }

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

    @Test
    public void testFinal3() {
        List<Employee> employees = EmployeeData.getEmployees();

        Employee employee = employees.get(0);
        employee.setAge(55);
        Foo foo = parameter -> {
            return parameter + " " + employee;
        };

        System.out.println(foo.method("hello"));
    }
}
