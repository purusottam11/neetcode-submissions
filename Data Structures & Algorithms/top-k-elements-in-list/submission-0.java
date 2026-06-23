class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int arr[] = new int[k];
        int index = k - 1;
        for (int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((i, j) -> countMap.get(i) - countMap.get(j));
        for (int i : countMap.keySet()) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        while (!minHeap.isEmpty()) {
            arr[index] = minHeap.remove();
            index--;
        }
        return arr;
    }
}
