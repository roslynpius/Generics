/**
 * Class to find the maximum of three Integer values.
 */
public class MaxValue {

    /**
     * Finds the maximum of three Integer values.
     *
     * @param num1 The first Integer value.
     * @param num2 The second Integer value.
     * @param num3 The third Integer value.
     * @return The maximum Integer value among the three.
     */
    public static Integer findMax(Integer num1,Integer num2,Integer num3)
    {
        Integer max=num1;

        if(num2.compareTo(max)>0)
        {
            max=num2;
        }
        if(num3.compareTo(max)>0)
        {
            max=num3;
        }
        return max;
    }

    /**
     * Tests the findMax method with three Integer values and prints the result.
     *
     * @param num1 The first Integer value.
     * @param num2 The second Integer value.
     * @param num3 The third Integer value.
     */
    public static void testMaxNumber(Integer num1, Integer num2, Integer num3) {
        Integer maxNumber = findMax(num1, num2, num3);
        System.out.println("Test Case: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Maximum Number: " + maxNumber);
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        testMaxNumber(5, 3, 2);

        // Test Case 2: Max at 2nd position
        testMaxNumber(1, 8, 6);

        // Test Case 3: Max at 3rd position
        testMaxNumber(4, 9, 12);
    }
}
