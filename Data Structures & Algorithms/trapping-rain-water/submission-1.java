class Solution {
    public int trap(int[] height) {
        
        int left=0, right=height.length-1;
        int maxRight= 0, maxLeft=0;
        int total=0;

        if(height.length == 0 || height==null) return 0;


        while(left<right){
            if(height[left]<height[right]){

                if(height[left]>=maxLeft){
                    maxLeft=height[left];
                }else{
                    total+=maxLeft-height[left];
                }
                left++;

            }else{
                if(height[right]>=maxRight){
                    maxRight=height[right];
                }else{
                    total+=maxRight-height[right];
                }

                right--;
            }



        }

        return total;


    }
}
