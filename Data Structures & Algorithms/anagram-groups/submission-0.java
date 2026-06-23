class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();

        for (String s : strs) {
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c : s.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

            List<String> list;
            if (map.containsKey(map1)) {
                list = map.get(map1);
                list.add(s);
            } else {
                list = new ArrayList<>();
                list.add(s);
            }
            map.put(map1, list);
        }
        for (Map<Character, Integer> key : map.keySet()) {
            results.add(map.get(key));
        }
        return results;
    }
}
