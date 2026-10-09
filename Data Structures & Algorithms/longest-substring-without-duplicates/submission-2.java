class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int longest = 0;
        int left= 0;


        for(int right = 0; right< s.length(); right++){

            char currentChar= s.charAt(right);

            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            longest = Math.max(longest, right-left+1);


        }

        return longest; 



    }
}
