/**
 * Generic class to find the maximum of multiple comparable objects.
 *
 * @param <T> The type of the objects, must extend Comparable.
 */
public class MaxValue<T extends Comparable<T>> {

    private T[] values;

    /**
     * Constructor for the MaxValue class.
     *
     * @param values The objects to be compared
     */
    public MaxValue(T... values) {
        this.values=values;
    }

    /**
     * Finds the maximum of the comparable objects.
     *
     * @return The maximum value.
     */
    public T findMax() {

        if (values.length==0){
            System.out.println("Nothing to compare.");
        }
        T max = values[0];

        for(int i=0;i<values.length;i++)
        {
            if(values[i].compareTo(max)>0)
                max=values[i];
        }

        return max;
    }

    /**
     * Tests the findMax method.
     */
    public void testMaxValue() {
        T maxVal = findMax();
        System.out.println("Test Case: ");
        for(int i=0;i<values.length;i++)
        {
            System.out.println(values[i]);
        }
        System.out.println("Maximum Value: " + maxVal);
        System.out.println();
    }

    /**
     * Static method to internally call the testMaxValue method passing three instance variables.
     *
     * @param values The objects to be compared.
     * @param <T> The type of the objects, must extend Comparable.
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

        testMaximum(3,4,1,5,7,3,6);
    }
}
