class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length();i++){
            for(int j = i+1; j<= s.length();j++){
                String ss = s.substring(i,j);
                //System.out.println(ss);
                if (Ispalindrome(ss) == true){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean Ispalindrome(String ss){
        int i = 0;
        int j = ss.length() - 1;
        while(i<=j){
            char a = ss.charAt(i);
            char b = ss.charAt(j);
            if(a!=b){
                return false;
            }
            else{
                i++;
                j--;
            }    
        }
        
        return true;
    }
}