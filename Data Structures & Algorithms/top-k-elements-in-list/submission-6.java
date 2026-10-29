class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int n: map.keySet()){

            minHeap.add(n);
            if(minHeap.size()>k){
                minHeap.poll();
            } 

        }

        int [] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll();
        }
        return result;

    }
}
