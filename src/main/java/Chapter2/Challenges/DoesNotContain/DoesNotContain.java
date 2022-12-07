package Chapter2.Challenges.DoesNotContain;

public class DoesNotContain {
    /**
     * The inverse of the contains value: check if the array does *not* contain the value.
     * Note that this is not as simple as flipping the return true/false in contains.
     * @param arr the array we will be manipulating.
     * @param target the value we are searching for.
     * @return true if arr does not contain target. false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target){
        int length = arr.length;
        int iters = 0;

        while (iters < length) {
            if(target == arr[iters]) {
                return false;
            } else {
                ++iters;
            }
        }



        return true;
    }
}
