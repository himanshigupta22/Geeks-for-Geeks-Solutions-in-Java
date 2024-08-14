class Solution{
    String modify(String s){
        String ans = "";
        if(s.charAt(0) <= 'Z'){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) >= 'a'){
                    char c = (char)(s.charAt(i) - 32);
                    ans += c;
                } else {
                     ans += s.charAt(i);
                }
               
            }
        } else {
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) <= 90){
                    char c = (char)(s.charAt(i) + 32);
                    ans += c;
                } else {
                     ans += s.charAt(i);
                }
        
            }
        }
        return ans;
    }
}
