class Solution {
    public String toLowerCase(String s) {
        char [] str = s.toCharArray();
        
        for(int i = 0; i < str.length; i++){
            if('A' <= str[i] && str[i] <= 'Z'){
                str[i] = (char)('a' + str[i] - 'A');
            }
        }
        return new String(str);
    }
}