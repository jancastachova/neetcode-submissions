class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] req: prerequisites){
            int course = req[0];
            int prereq= req[1];
            adj.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses; i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            result[index++]=curr;

            for(int neighbor: adj.get(curr)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        return index == numCourses ? result : new int[0];
    }
}
