class Solution {
    
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>dups = new HashSet<>();
        
        for(int num:nums){
            if(!dups.add(num)){
                return true;
            }
        }

        return false;
    }
}