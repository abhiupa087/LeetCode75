package leetcode75.string;

public class GreatestCommonDivisor {

    public static String gcdOfStrings(String str1, String str2) {
        var gcd = "";
        for (int i = 1; i <= str2.length(); i++) {
            var divisor = str2.substring(0, i);
            var arr1 = str1.split(divisor);
            var arr2 = str2.split(divisor);
            if (arr1.length == 0 && arr2.length == 0) {
                gcd = divisor;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

}
