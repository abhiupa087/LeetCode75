package leetcode75.prefixsum;

public class LargestAltitude {

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int tempMaxAltitude = 0;
        for (int j : gain) {
            tempMaxAltitude += j;
            if (tempMaxAltitude > maxAltitude) {
                maxAltitude = tempMaxAltitude;
            }
        }
        return maxAltitude;
    }
}
