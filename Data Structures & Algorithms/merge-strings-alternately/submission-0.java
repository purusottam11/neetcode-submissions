class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n = word2.length();

        StringBuilder stringBuilder = new StringBuilder();

        while (i < word1.length() || j < word2.length()) {
            if (i < m) {
                stringBuilder.append(word1.charAt(i));
                i++;
            }
            if (j < n) {
                stringBuilder.append(word2.charAt(j));
                j++;
            }
        }
        return stringBuilder.toString();
    }
}