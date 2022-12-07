package Chapter2.Challenges.ReturnArrayContents;
/*

 */
public class ReturnArrayContents {
    /**
     * return a string with the array's contents.
     * The string should be formatted with commas and spaces like this:
     *
     * 1, 2, 3, 4
     * the last item should not have a comma.
     * Spaces at the end of the string will not affect test results.
     *
     * @param nums the array to be manipulated.
     * @return a string representation of all values of nums, with the values separated by commas and spaces.
     */
    public String arrayToString(int[] nums){
        int len = nums.length;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < len; i++) {
            ans.append(nums[i]);
            if (i < (len - 1)) {
                ans.append(", ");
            }
        }




        return ans.toString();}
}
