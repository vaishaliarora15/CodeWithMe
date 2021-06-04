class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        Integer minrow = 0;
        Integer mincol = 0;
        Integer maxrow = matrix.length - 1;
        Integer maxcol = matrix[0].length - 1;
        int times = matrix.length * matrix[0].length;
        int count = 0;
        while(times>count){
            for(Integer i = minrow,j = mincol;j<=maxcol && times>count; j++){
                spiral.add(matrix[i][j]);
                // System.out.println(matrix[i][j]);
                count++;
            }
            minrow++;
            for(Integer i = minrow,j = maxcol;i<=maxrow && times>count; i++){
                spiral.add(matrix[i][j]);
                //System.out.println(matrix[i][j]);
                count++;
            }
            maxcol--;
            for(Integer i = maxrow,j = maxcol;j >= mincol && times>count; j--){
                spiral.add(matrix[i][j]);
                count++;
            }
            maxrow--;
            for(Integer i = maxrow,j = mincol;i >= minrow && times>count; i--){
                spiral.add(matrix[i][j]);
                count++;
            }
            mincol++;
        }
    return spiral;
    }
    
}