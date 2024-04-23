package com.oocode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ElfTest {

    private ElfCalories elfCalories;

    @BeforeEach
    public void setUp() {
        elfCalories = new ElfCalories();
    }

    @Test()
    public void getMostCaloriesTest() {
        var input = "1000";
        assertThat(elfCalories.getMostCalories(input), equalTo(1000));
    }

    @Test()
    public void getMostCaloriesTest2() {
        var input = "3000";
        assertThat(elfCalories.getMostCalories(input), equalTo(3000));
    }

    @Test()
    public void getMostCaloriesTest3() {
        var input = "1000\n" +
                "2000\n" +
                "3000\n";
        assertThat(elfCalories.getMostCalories(input), equalTo(6000));
    }

}
