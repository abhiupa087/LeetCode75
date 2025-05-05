package leetcode75.stack;

public class RemoveStars {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1); // simulate pop
                }
            } else {
                sb.append(c); // simulate push
            }
        }
        return sb.toString();
    }
}
