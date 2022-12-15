package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        List<Employee> a = new ArrayList<>();

        a.add(new Employee(1, "Seungcheol Choi", 27, 8670));
        a.add(new Employee(2, "Jeonghan Yoon", 27, 5670));
        a.add(new Employee(3, "Joshua Hong", 27, 8090));
        a.add(new Employee(4, "Junhui Wen", 26, 4670));
        a.add(new Employee(5, "Vernon Chwe", 24, 7890));
        a.add(new Employee(6, "Seungkwan Boo", 24, 9870));

        return a;
    }


}
