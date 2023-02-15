package Chapter4.Challenges.CombineArrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array.
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        // determining length of first array
        int length1 = arr1.length;
        // determining length of second array
        int length2 = arr2.length;

        // resultant array size
        int length = length1 + length2;

        // Creating a new array
        int[] newArray = new int[length];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < length1; i = i + 1) {
            // Storing the elements in
            // the resultant array
            newArray[i] = arr1[i];
        }

        // Loop to concat the elements of second
        // array into resultant array
        for (int i = 0; i < length2; i = i + 1) {

            // Storing the elements in the
            // resultant array
            newArray[length1 + i] = arr2[i];
        }

        return newArray;
    }
}
