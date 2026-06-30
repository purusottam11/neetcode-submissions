class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int arr[] = new int[n];
        int brr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = height[i];
            brr[i] = height[i];
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                arr[i] = arr[i - 1];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (brr[i] < brr[i + 1]) {
                brr[i] = brr[i + 1];
            }
        }

        for (int i = 1; i < n - 1; i++) {
            int min = Math.min(arr[i - 1], brr[i + 1]);
            if (min > height[i]) {
                sum += (min - height[i]);
            }
        }
        return sum;
    }
}
