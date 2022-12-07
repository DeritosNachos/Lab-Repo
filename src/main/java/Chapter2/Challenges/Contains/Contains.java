package Chapter2.Challenges.Contains;


public class Contains {

    /**
     * A method to search an array to see if that array contains some value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
        int length = arr.length;
        int iters = 0;

        while (iters < length) {
            if(target == arr[iters]) {
                return true;
            } else {
                ++iters;
            }
        }

            return false;
    }
}