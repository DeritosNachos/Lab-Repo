package Chapter3.Challenges.GetMax;
public class GetMax {
    /**
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int maxNum = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(maxNum < arr[i]) {
                maxNum = arr[i];
            }
<<<<<<< HEAD

        }


=======
        }

>>>>>>> 4ea1baa667a46034d4b759a8eda62c7599735095
        return maxNum;
    }
}
