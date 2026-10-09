class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left<right && !isAlphaNumeric(s.charAt(left))){
                left++;
            }
            while(left<right && !isAlphaNumeric(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || 
               (c >= 'A' && c <= 'Z') || 
               (c >= '0' && c <= '9');
    }
}
