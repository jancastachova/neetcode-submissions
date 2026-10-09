public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int maxEnd = 0;

        for (int i = 0; i < s.length(); i++) {
            maxEnd = Math.max(maxEnd, lastIndex[s.charAt(i) - 'a']);

            if (i == maxEnd) {
                result.add(i - start + 1); 
                start = i + 1;            
            }
        }

        return result;
    }
}