package leetcode75.slidingWindow;

import java.util.List;
import java.util.Set;

public class MaxVowelInSubstring {

    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        var substring = s.substring(0, k);
        int windowVowelCount = 0;
        for (int i = 0; i < substring.length(); i++) {
            Character ch = substring.charAt(i);
            if (vowels.contains(ch)) {
                windowVowelCount++;
            }
        }
        int maxVowelCount = windowVowelCount;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i)) && !vowels.contains(s.charAt(i - k))) {
                ++windowVowelCount;
            } else if (!vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(i - k))) {
                --windowVowelCount;
            }
            maxVowelCount = Math.max(windowVowelCount, maxVowelCount);
        }
        return maxVowelCount;
    }
}
