/**
 * Generic class to find the maximum of three comparable objects.
 *
 * @param <T> The type of the objects, must extend Comparable.
 */
public class MaxValue<T extends Comparable<T>> {

    private T value1;
    private T value2;
    private T value3;

    /**
     * Constructor for the MaxValue class.
     *
     * @param value1 The first object.
     * @param value2 The second object.
     * @param value3 The third object.
     */
    public MaxValue(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    /**
     * Finds the maximum of the three comparable objects.
     *
     * @return The maximum value among the three.
     */
    public T findMax() {
        T max = value1;

        if (value2.compareTo(max) > 0) {
            max = value2;
        }

        if (value3.compareTo(max) > 0) {
            max = value3;
        }

        return max;
    }

    /**
     * Tests the findMax method.
     */
    public void testMaxValue() {
        T maxVal = findMax();
        System.out.println("Test Case: " + value1 + ", " + value2 + ", " + value3);
        System.out.println("Maximum Value: " + maxVal);
        System.out.println();
    }

    /**
     * Static method to internally call the testMaxValue method passing three instance variables.
     *
     * @param value1 The first object.
     * @param value2 The second object.
     * @param value3 The third object.
     * @param <T> The type of the objects, must extend Comparable.
     */
    public static <T extends Comparable<T>> void testMaximum(T value1, T value2, T value3) {
        MaxValue<T> maxValue = new MaxValue<>(value1, value2, value3);
        maxValue.testMaxValue();
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        testMaximum(5, 4, 3);

        // Test Case 2: Max at 2nd position
        testMaximum(3.3f, 6.1f, 1.2f);

        // Test Case 3: Max at 3rd position
        testMaximum("movies", "books", "songs");
    }
}
