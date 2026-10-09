class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1;
        int right=0;

        for(int pile: piles){
            right = Math.max(right, pile);
        }

        while(left<right){
            
            int mid = left+(right-left)/2;

            if(canEatAll(piles, h, mid)){
                right = mid;
            }else{
                left = mid+1;
            }

        }
        return left;


    }

    private boolean canEatAll(int[] piles, int h, int k){
        long hoursNeeded = 0;
        for(int p: piles){
            hoursNeeded += (p+k-1)/k;
        }
        return hoursNeeded<=h;
    }
}
