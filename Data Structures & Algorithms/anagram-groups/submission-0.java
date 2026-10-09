class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[]arr = s.toCharArray();
            Arrays.sort(arr);

            String sortedKey = new String(arr);

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey, new ArrayList<>());
            }

            map.get(sortedKey).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
