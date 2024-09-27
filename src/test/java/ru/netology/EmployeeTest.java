package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    private long id = 1;
    private String firstName = "John";
    private String lastName = "Smith";
    private String country = "USA";
    private int age = 25;

    Employee employee = new Employee(id, firstName, lastName, country, age);

    @Test
    public void testEmployeeCreationSuccessful() {

        Assertions.assertEquals(id, employee.id);
        Assertions.assertEquals(firstName, employee.firstName);
        Assertions.assertEquals(lastName, employee.lastName);
        Assertions.assertEquals(country, employee.country);
        Assertions.assertEquals(age, employee.age);
    }

    @Test
    public void testThrowErrorCheck() {
        int invalidAge = -25;

        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Employee(id, firstName, lastName, country, invalidAge));
    }

    @Test
    public void testToString() {

        String result = employee.toString();

        Assertions.assertTrue(result.contains("1"));
        Assertions.assertTrue(result.contains("John"));
        Assertions.assertTrue(result.contains("Smith"));
        Assertions.assertTrue(result.contains("USA"));
        Assertions.assertTrue(result.contains("25"));
    }
}
