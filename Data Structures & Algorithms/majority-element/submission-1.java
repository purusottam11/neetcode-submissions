class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = -1;

        for (int i : nums) {
            if (count == 0) {
                ans = i;
                count++;
            } else if (i == ans) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}