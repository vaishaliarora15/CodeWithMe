class Solution {
    
    class Pair{
        int first;
        int second;
        Pair(int f, int s){
            first = f;
            second = s;
        }
        int first() { return first; }
        int second() { return second; }
    }
    
    public int largestRectangleArea(int[] heights) {
        Stack<Pair> st = new Stack<>();
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        
        for(int i = 0; i< heights.length; i++){
            if(st.size() == 0){
                left[i] = -1;
            }
            else if(st.size() > 0 && heights[i] > st.peek().first()){
                left[i] = st.peek().second();
            }
            else if(st.size() > 0 && heights[i] <= st.peek().first()){
                while(st.size() > 0 && heights[i] <= st.peek().first()){
                    st.pop();
                }
                if(st.size() == 0){
                left[i] = -1;
                }
                else if(st.size() > 0 && heights[i] > st.peek().first()){
                    left[i] = st.peek().second();
                }
                
            }
            st.push(new Pair(heights[i],i));
            
        }
        st = new Stack<>();
        
        for(int i = heights.length -1; i>=0; i--){
            if(st.size() == 0){
                right[i] = heights.length ;
            }
            else if(st.size() > 0 && heights[i] > st.peek().first()){
                right[i] = st.peek().second();
            }
            else if(st.size() > 0 && heights[i] <= st.peek().first()){
                while(st.size() > 0 && heights[i] <= st.peek().first()){
                    st.pop();
                }
                if(st.size() == 0){
                    right[i] = heights.length ;
                }
                else if(st.size() > 0 && heights[i] > st.peek().first()){
                    right[i] = st.peek().second();
                }
                
            }
            st.push(new Pair(heights[i],i));
            
        }
        int max=heights[0];
        for(int a=0;a<heights.length;a++)
        {
            max=Math.max(max,(right[a]-left[a]-1)*heights[a]);
        }
        return max;
    }
}