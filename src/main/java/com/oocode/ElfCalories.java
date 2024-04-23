package com.oocode;

import java.util.*;

public class ElfCalories {


    public int getMostCalories(String input) {
        List<String> nums = Arrays.asList(input.split("\n\n"));
        List<Integer> totalsNum = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            totalsNum.add(getTotal(nums.get(i)));
        }
        return Collections.max(totalsNum);
    }

    private Integer getTotal(String nums) {
        List<String> numbers = Arrays.asList(nums.split("\n"));
        return numbers.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}


