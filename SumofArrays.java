// { Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] a = new int[n], b = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().findSum(a, b);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends



class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = a.length-1;
        int j = b.length-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int d = carry;
            if(i>=0){
                d += a[i];
            }
            if(j>=0){
                d += b[j];
            }
            carry = d/10;
            d = d%10;
            res.add(d);
            
            i--;
            j--;
        }
        if(carry!=0){
            res.add(carry);
        }
        for (int k = 0; k < res.size() / 2; k++) {
            Integer temp = res.get(k);
            res.set(k, res.get(res.size() - k - 1));
            res.set(res.size() - k - 1, temp);
        }
        
        return res;
    }
}