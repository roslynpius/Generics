/**
 * Class to find the maximum of three string values.
 */
public class MaxValue {

    /**
     * Finds the maximum of three String values.
     *
     * @param str1 The first String value.
     * @param str2 The second String value.
     * @param str3 The third String value.
     * @return The maximum String value among the three.
     */
    public static String findMax(String str1, String str2, String str3) {
        String max=str1;

        if(str2.compareTo(max)>0)
            max=str2;
        if(str3.compareTo(max)>0)
            max=str3;

        return max;
    }

    /**
     * Tests the findMax method with three String values and prints the result.
     *
     * @param str1 The first String value.
     * @param str2 The second String value.
     * @param str3 The third String value.
     */
    public static void testMaxNumber(String str1, String str2, String str3) {
        String maxString = findMax(str1, str2, str3);
        System.out.println("Test Case: " + str1 +", " + str2 + ", " + str3);
        System.out.println("Maximum Number: " + maxString);
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        testMaxNumber("Zebra","Lion","Deer");

        // Test Case 2: Max at 2nd position
        testMaxNumber("Apple", "Peach", "Banana");

        // Test Case 3: Max at 3rd position
        testMaxNumber("movies","books","songs");
    }
}
