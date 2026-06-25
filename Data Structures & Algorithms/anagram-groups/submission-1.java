class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();

        for (String s : strs) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            if (map.containsKey(charMap)) {
                List<String> list = map.get(charMap);
                list.add(s);
                map.put(charMap, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(charMap, list);
            }
        }

        for (Map<Character, Integer> key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }

}
