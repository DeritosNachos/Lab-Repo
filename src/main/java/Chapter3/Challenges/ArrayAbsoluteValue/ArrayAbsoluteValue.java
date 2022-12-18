package Chapter3.Challenges.ArrayAbsoluteValue;

public class ArrayAbsoluteValue {
    /**
     * Given an array of integers, produce an array of integers composed of the absolute values of all the numbers
     * in nums. Absolute value represents the distance from zero, so negative numbers should become positive and
     * positive numbers can stay the same.
     * @param nums an array to be manipulated.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                newArray[i] = -nums[i];
            } else {
                newArray[i] = nums[i];
            }
        }



        return newArray;
    }
}