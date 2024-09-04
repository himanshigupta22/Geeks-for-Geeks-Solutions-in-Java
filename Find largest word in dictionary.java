class Solution {
    static String findLongestWord(String S, List<String> d) {
        // code here
        String ans = "";
        
        for(int idx=0; idx < d.size(); idx++){
            String word = d.get(idx);
            int p1=0, p2=0;
            while(p1 < word.length() && p2 < S.length()){
                if(word.charAt(p1) == S.charAt(p2)){
                    p1++; p2++;
                } else {
                    p2++;
                }
            }
            if(p1 == word.length()){
                if(word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans) < 0)){
                    ans = word;
                }
            }
        }
        return ans;
    }
}
