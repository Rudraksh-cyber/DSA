// ----------------------------------------------------
// Description:
// This program performs a linear search to find the
// smallest index where the target element appears.
// If the target is not found, it returns -1.
// ----------------------------------------------------

class Solution {

    public int linearSearch(int nums[], int target) {

        // Traverse the array from left to right
        for (int i = 0; i < nums.length; i++) {

            // Check if the current element is the target
            if (nums[i] == target) {
                return i;
            }
        }

        // Target not found
        return -1;
    }
}
