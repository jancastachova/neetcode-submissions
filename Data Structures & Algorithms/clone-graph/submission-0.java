/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;

        HashMap<Node, Node> map = new HashMap<>();

        return dfs(node, map);
    }

    private Node dfs(Node current, HashMap<Node, Node> map){
        if(map.containsKey(current)){
            return map.get(current);
        }

        Node clone = new Node(current.val);

        map.put(current, clone);

        for (Node neighbor : current.neighbors) {
            clone.neighbors.add(dfs(neighbor, map));
        }
        return clone;
    }
}