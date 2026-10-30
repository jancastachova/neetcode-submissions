class Solution {
    public int[][] merge(int[][] intervals) {
        //safety check 
        if(intervals == null || intervals.length<=1){
            return intervals;
        }
        //sort the array of interval
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        
        List<int[]> result = new ArrayList<>(); // final sorted intervals
        int[]currentInterval = intervals[0];//first interval saved in current interval variable
        result.add(currentInterval); //?

    for(int[] interval: intervals){
        int currentBegin = currentInterval[0];
        int currentEnd = currentInterval[1];

        int nextBegin = interval[0];
        int nextEnd = interval[1];

        if(nextBegin<= currentEnd){
            currentInterval[1] = Math.max(currentEnd, nextEnd);
        }else{
            currentInterval = interval;
            result.add(currentInterval);
        }

    } 

    return result.toArray(new int[result.size()][]);
        
    }
}
