class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>dups = new HashSet<>();
        int left = 0;
        int maxLength=0;

        for(int right =0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            while(dups.contains(currentChar)){
                dups.remove(s.charAt(left));
                left++;
            }
            
            dups.add(currentChar);

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;

    }
}
