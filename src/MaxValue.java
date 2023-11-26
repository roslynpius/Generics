/**
 * Class to find the maximum of three comparable objects.
 */
public class MaxValue {

    /**
     * Finds the maximum of three comparable objects.
     *
     * @param value1 The first object.
     * @param value2 The second object.
     * @param value3 The third object.
     * @return The maximum value among the three.
     */
    public static <T extends Comparable<T>> T findMax(T value1, T value2, T value3) {
        T max=value1;

        if(value2.compareTo(max)>0)
            max=value2;
        if(value3.compareTo(max)>0)
            max=value3;

        return max;
    }

    /**
     * Tests the findMax method with three comparable objects and prints the result.
     *
     * @param value1 The first object.
     * @param value2 The second object.
     * @param value3 The third object.
     * @param <T>  The type of the objects, must extend Comparable.
     */
    public static <T extends Comparable<T>> void testMaxValue(T value1, T value2, T value3) {
        T maxVal = findMax(value1, value2, value3);
        System.out.println("Test Case: " + value1 +", " + value2 + ", " + value3);
        System.out.println("Maximum Value: " + maxVal);
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        testMaxValue(5,4,3);

        // Test Case 2: Max at 2nd position
        testMaxValue(3.3f,6.1f,1.2f);

        // Test Case 3: Max at 3rd position
        testMaxValue("movies","books","songs");
    }
}
