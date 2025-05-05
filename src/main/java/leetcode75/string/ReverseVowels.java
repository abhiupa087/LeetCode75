package leetcode75.string;

import java.util.List;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        var vowelList = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O');
        vowelList.add('U');
        for (Character vowel : vowelList){
            System.out.println(vowel);
        }
        int start = 0;
        int end = s.length() - 1;
        char[] charArr = s.toCharArray();

        if (start == end) {
            return s;
        }

        while (start < end) {
            if (vowelList.contains(s.charAt(start)) && vowelList.contains(s.charAt(end))) {
                charArr[start] = s.charAt(end);
                charArr[end] = s.charAt(start);
                start++;
                end--;
            } else if (vowelList.contains(s.charAt(start))) {
                end--;
            } else if (vowelList.contains(s.charAt(end))) {
                start++;
            } else {
                start++;
                end--;
            }
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
