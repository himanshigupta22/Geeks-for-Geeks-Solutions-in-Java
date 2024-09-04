class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()){
            if(freq[ch-'a'] == 1) return String.valueOf(ch);
            freq[ch-'a']++;
        }
        return "-1";
    }
} 
