class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append('#').append(s);
        }
       return sb.toString(); 
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i= 0; //pointer to the beginning of the word

        while(i<str.length()){

            int j=i; //pointer thats moving

            while(str.charAt(j)!='#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1, j+1+length);
            result.add(word);

            i = j+1+length;

        }

    return result;

    }
}
