class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;

        for(int n: nums){
            set.add(n);
        }

        for(int n: nums){
            if(!set.contains(n-1)){
                int currentStreak=1;
                int currentNumber=n;

                while(set.contains(currentNumber+1)){
                    currentStreak+=1; 
                    currentNumber+=1;

                }

                max = Math.max(currentStreak, max);
            }

        }
        return max;
    }

}