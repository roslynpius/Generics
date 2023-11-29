package com.bridgelabz.maxvalue;

/**
 *
 * @param <T> The type of the objects, must extend Comparable.
 * @desc Generic class to find the maximum of multiple comparable objects.
 */
public class MaxValue<T extends Comparable<T>> {

    private T[] values;

    /**
     *
     * @param values The objects to be compared.
     * @desc Constructor for the MaxValue class.
     */
    public MaxValue(T... values) {
        this.values = values;
    }

    /**
     * @desc Finds the maximum of the comparable objects.
     * @return The maximum value among the objects.
     */
    public T findMax() {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one value must be provided");
        }

        T max = values[0];

        for (T value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    /**
     *
     * @param max The maximum value.
     * @param values The objects to be compared.
     * @param <T> The type of the objects, must extend Comparable.
     * @desc Generic method to print the maximum value.
     */
    public static <T> void printMax(T max, T... values) {
        System.out.print("Test Case: ");
        for (T value : values) {
            System.out.print(value + ", ");
        }
        System.out.println("\nMaximum Value: " + max);
        System.out.println();
    }

    /**
     * @desc Tests the findMax method, prints the result, and also prints the max value.
     */
    public void testMaxValue() {
        T maxVal = findMax();
        printMax(maxVal, values);
    }

    /**
     *
     * @param values The objects to be compared.
     * @param <T> The type of the objects, must extend Comparable.
     * @desc Static method to internally call the testMaxValue method passing multiple instance variables.
     */
    public static <T extends Comparable<T>> void testMaximum(T... values) {
        MaxValue<T> maxValue = new MaxValue<>(values);
        maxValue.testMaxValue();
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        testMaximum(5, 4, 3);

        // Test Case 2: Max at 2nd position
        testMaximum(3.3f, 6.1f, 1.2f);

        // Test Case 3: Max at 3rd position
        testMaximum("movies", "books", "songs");

        // Test Case 4: Max with more than three parameters
        testMaximum(10, 8, 15, 7, 12, 9);
    }
}
