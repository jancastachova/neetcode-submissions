class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((p1,p2)-> getDistance(p2) - getDistance(p1));

        for(int[] point: points){
            maxHeap.add(point);


            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int [][] result = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()){
            result[i++]=maxHeap.poll();
        }
        return result;
    }

    private int getDistance(int[] point){
        return point[0]*point[0]+point[1]*point[1];
    }
}
