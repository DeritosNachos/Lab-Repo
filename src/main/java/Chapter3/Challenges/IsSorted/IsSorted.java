package Chapter3.Challenges.IsSorted;
public class IsSorted {
    /**
     * @param arr an int array to be manipulated
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
<<<<<<< HEAD
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) return false;
=======
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
>>>>>>> 4ea1baa667a46034d4b759a8eda62c7599735095
        }

        return true;
    }
}
