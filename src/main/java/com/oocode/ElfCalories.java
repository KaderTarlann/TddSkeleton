package com.oocode;

import java.util.Arrays;
import java.util.List;

public class ElfCalories {


    public int getMostCalories(String input) {
        List<String> nums = Arrays.asList(input.split("\n"));
        return nums.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}


