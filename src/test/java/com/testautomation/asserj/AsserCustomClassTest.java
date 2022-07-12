package com.testautomation.asserj;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class AsserCustomClassTest {

    @Test
    public void customClassTest(){

        Employee emp1 = new Employee(25, "tasfin", 100);
        Employee emp2 = new Employee(25, "tasfin", 100);

        Assertions.assertThat(emp1)
                .isEqualToComparingFieldByField(emp2)
                .isNotNull()
                .isInstanceOf(Employee.class)
                .hasFieldOrProperty("age")
                .hasFieldOrPropertyWithValue("name", "tasfin");

    }

}
