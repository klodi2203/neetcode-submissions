class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0) {
            return new ArrayList();
        }

        Map<String,List> ansMap = new HashMap<>();

        int[] alphabet = new int[26];

        for(String s : strs){
            Arrays.fill(alphabet,0);

            for(char c : s.toCharArray()){
                alphabet[c-'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            for(int c : alphabet){
                sb.append('#');
                sb.append(c);
            }

            String key = sb.toString();

            if(!ansMap.containsKey(key)){
                ansMap.put(key,new ArrayList());
            }

            ansMap.get(key).add(s);
        }

        return new ArrayList(ansMap.values());
        
    }
}
