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


}
