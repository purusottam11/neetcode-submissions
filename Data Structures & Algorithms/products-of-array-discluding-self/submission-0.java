class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int brr[] = new int[n];
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            brr[i] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            arr[i] *= arr[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            brr[i] *= brr[i + 1];
        }

        result[0] = brr[1];
        result[n - 1] = arr[n - 2];

        for (int i = 1; i < n - 1; i++) {
            result[i] = arr[i - 1] * brr[i + 1];
        }
        return result;
    }
}  
