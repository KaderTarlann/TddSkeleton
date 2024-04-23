package com.oocode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ElfCalories {


    public static int getTopThreeCalories(String input) {
        List<String> nums = Arrays.asList(input.split("\n\n"));
        List<Integer> totalsNum = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            totalsNum.add(getTotal(nums.get(i)));
        }
        var size = totalsNum.size();
        Collections.sort(totalsNum);

        return totalsNum.get(size -1) + totalsNum.get(size -2) + totalsNum.get(size -3);
    }

    public static int getMostCalories(String input) {
        List<String> nums = Arrays.asList(input.split("\n\n"));
        List<Integer> totalsNum = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            totalsNum.add(getTotal(nums.get(i)));
        }

        return Collections.max(totalsNum);
    }

    private static Integer getTotal(String nums) {
        List<String> numbers = Arrays.asList(nums.split("\n"));
        return numbers.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) throws IOException {
        String input = Files.readString(Paths.get("src/test/resources/day1.txt"));
        System.out.println(getMostCalories(input));
        System.out.println(getTopThreeCalories(input));
    }
}


