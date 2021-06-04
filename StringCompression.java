class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int newlen = 0;
        while(i<n){
            int j = i;
            while(j<n && chars[i] == chars[j]){
                j++;
            }
            chars[newlen++] = chars[i];
            if(j-i > 1){
                String count = j-i + "";
                for(char c : count.toCharArray()){
                    chars[newlen++] = c;
                }
            }
            i = j;
        }
        return newlen;
    }
}