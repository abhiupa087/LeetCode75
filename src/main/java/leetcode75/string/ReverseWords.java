package leetcode75.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        List<String> words = Arrays.stream(s.split(" "))
            .filter(word -> !word.isEmpty())
            .collect(Collectors.toList());

        Collections.reverse(words);

        return String.join(" ", words);
    }
}
