class Solution {
    public int trap(int[] height) {
        if(height.length == 0){
            return 0; 
        }
        int maxl [] = new int[height.length];
        int maxr [] = new int[height.length];
        maxl[0] = height[0];
        for(int i = 1; i < maxl.length; i++){
            maxl[i] = Math.max(maxl[i-1],height[i]);
        }
        
        maxr[maxr.length - 1] = height[height.length - 1];
        for(int i = maxr.length-2; i >= 0; i--){
            maxr[i] = Math.max(maxr[i+1],height[i]);
        }
        
        int[] water = new int[height.length];
        
        for(int i = 0; i < water.length; i++){
            water[i] = Math.min(maxl[i],maxr[i]) - height[i];
        }
        int sum = 0;
        
        for(int i = 0; i < water.length; i++){
            sum += water[i];
        }
        return sum;
    }
}
