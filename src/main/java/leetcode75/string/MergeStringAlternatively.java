package leetcode75.string;


import java.util.stream.IntStream;

public class MergeStringAlternatively {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        var word1Len = word1.length();
        var word2Len = word2.length();

        var minWordLength = Math.min(word2Len, word1Len);
        var mergedString = new StringBuilder();
        IntStream.range(0, minWordLength)
            .forEach(i -> mergedString.append(word1.charAt(i))
                .append(word2.charAt(i)));

        if (word1Len > word2Len) {
            mergedString.append(word1.substring(minWordLength));
        } else if (word2Len > word1Len) {
            mergedString.append(word2.substring(minWordLength));
        }
        return mergedString.toString();
    }
}
