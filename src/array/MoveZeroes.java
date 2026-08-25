// ----------------------------------------------------
// Description:
// This program moves all zeroes to the end of an array
// while maintaining the relative order of non-zero elements.
// ----------------------------------------------------

class Solution {

    public void moveZeroes(int[] nums) {

        // Pointer to the first zero
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, return
        if (j == -1) {
            return;
        }

        // Find non-zero elements and move them forward
        for (int i = j + 1; i < nums.length; i++) {

            if (nums[i] != 0) {

                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j to the next position
                j++;
            }
        }
    }
}
