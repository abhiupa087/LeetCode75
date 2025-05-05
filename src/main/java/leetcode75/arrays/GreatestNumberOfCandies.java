package leetcode75.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(0); // Use orElse to handle potential empty array

        return Arrays.stream(candies)
            .mapToObj(candy -> candy + extraCandies >= max)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }

}
