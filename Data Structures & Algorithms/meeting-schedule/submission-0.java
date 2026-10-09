
public class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return true;
        }

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval current = intervals.get(i);
            Interval next = intervals.get(i + 1);

         
            if (next.start < current.end) {
                return false;
            }
        }

        return true;
    }
}