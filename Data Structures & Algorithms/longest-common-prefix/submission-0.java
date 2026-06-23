class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}