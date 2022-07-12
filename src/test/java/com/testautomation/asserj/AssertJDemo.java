package com.testautomation.asserj;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssertJDemo {

    @Test
    public void stringTest(){

        String temp = "Hello World";

        Assertions.assertThat(temp)
                .isNotNull()
                .isNotEmpty()
                .isNotBlank()
                .isEqualTo("Hello World")
                .contains("Hello")
                .doesNotContain("void")
                .containsWhitespaces()
                .containsIgnoringCase("world")
                .matches("\\w.*" + "World")
                .doesNotContainPattern("\\d.*")
                .hasSize(11)
                .hasSizeGreaterThan(10)
                .hasSizeBetween(10, 20)
                .endsWith("World");
    }

    @Test
    public void numbersTest(){

        int value = 10;

        Assertions.assertThat(value)
                .isEqualTo(10)
                .isCloseTo(14, Offset.offset(5))
                .isInstanceOf(Integer.class)
                .isBetween(3,15)
                .isCloseTo(12, Percentage.withPercentage(30))
                .isNotCloseTo(15, Percentage.withPercentage(30))
                .isPositive()
                .isEven()
                .isGreaterThanOrEqualTo(5)
                .isLessThanOrEqualTo(15);
    }

    @Test
    public void listTest(){
        List<String> list = Arrays.asList("GTZ", "Accounting", "Portal");
        List<String> list2 = Arrays.asList("GTZ", "CR2", "Portal");
        List<String> list3 = Arrays.asList("CC1", "GTZDemand", "GTZShip");
        List<String> list4 = Arrays.asList("GTZ", "Accounting", "Portal");

        Assertions.assertThat(list)
                .hasSize(3)
                .hasAtLeastOneElementOfType(String.class)
                .isNotEmpty()
                .contains("Accounting")
                .doesNotContain("Automation")
                .startsWith("GTZ")
                .containsExactlyInAnyOrder("Accounting", "GTZ", "Portal")
                .containsAll(list4)
                .doesNotContainAnyElementsOf(list3);

    }

    @Test
    public void mapTest(){

        Map<String, String> map = new HashMap<>();

        map.put("name", "Tasfin");
        map.put("project", "STAB UI Automation");
        map.put("priority", "High");

        Assertions.assertThat(map)
                .containsEntry("name", "Tasfin")
                .hasSize(3)
                .isNotEmpty()
                .doesNotContainEntry("name","Amuthan")
                .doesNotContainKey("game")
                .containsKey("project")
                .containsValue("High");

    }
}
