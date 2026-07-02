
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        Map<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) need.merge(c, 1, Integer::sum);

        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            char in = s2.charAt(i);
            window.merge(in, 1, Integer::sum);

            if (i >= n1) {
                char out = s2.charAt(i - n1);
                if (window.merge(out, -1, Integer::sum) == 0) window.remove(out);
            }

            if (i >= n1 - 1 && window.equals(need)) return true;
        }
        return false;
    }
}