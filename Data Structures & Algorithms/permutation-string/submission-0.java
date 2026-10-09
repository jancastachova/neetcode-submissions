class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()){
            return false;
        }
        
        int []count = new int[26];
        int []windowCounts = new int[26];


        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            windowCounts[s2.charAt(i)-'a']++;
        }

        if(matches(count, windowCounts)) return true;


        int left=0;
        for(int right = s1.length(); right<s2.length(); right++){
            windowCounts[s2.charAt(right)-'a']++;

            windowCounts[s2.charAt(left) -'a']--;
            left++;

            if(matches(count, windowCounts)) return true;
        }


        return false;
    }
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
