class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int sum = 0 - nums[i];
            while (j < k) {
                if ((nums[j] + nums[k]) == sum) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(list);
                    j++;
                    k--;
                } else if ((nums[j] + nums[k]) > sum) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result.stream().toList();
    }
}
