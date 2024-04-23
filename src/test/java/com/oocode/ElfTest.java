package com.oocode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class ElfTest {

    private ElfCalories elfCalories;

    @BeforeEach
    public void setUp() {
        elfCalories = new ElfCalories();
    }

    @Test()
    public void getMostCaloriesTest() {
        assertThrows(RuntimeException.class, () -> elfCalories.getMostCalories(""));
    }


}
