/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return 0;
        }

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(intervals.get(0).end);

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);


            if (current.start >= minHeap.peek()) {
                minHeap.poll(); 
            }

            minHeap.offer(current.end);
        }

        return minHeap.size();
    }
}