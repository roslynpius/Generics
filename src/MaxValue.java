/**
 * Class to find the maximum of three Integer values.
 */
public class MaxValue {

    /**
     * Finds the maximum of three float values.
     *
     * @param num1 The first float value.
     * @param num2 The second float value.
     * @param num3 The third float value.
     * @return The maximum float value among the three.
     */
    public static float findMax(float num1, float num2, float num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    /**
     * Tests the findMax method with three float values and prints the result.
     *
     * @param num1 The first float value.
     * @param num2 The second float value.
     * @param num3 The third float value.
     */
    public static void testMaxNumber(float num1, float num2, float num3) {
        float maxNumber = findMax(num1, num2, num3);
        System.out.println("Test Case: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Maximum Number: " + maxNumber);
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        testMaxNumber(5.5f, 3.3f, 2.3f);

        // Test Case 2: Max at 2nd position
        testMaxNumber(5.1f, 9.3f, 6.3f);

        // Test Case 3: Max at 3rd position
        testMaxNumber(4.9f, 2.3f, 11.2f);
    }
}
