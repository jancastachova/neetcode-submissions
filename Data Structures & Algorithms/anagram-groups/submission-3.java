class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);

            if(!map.containsKey(word)){
                map.put(word, new ArrayList<>());
            }

            map.get(word).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}
