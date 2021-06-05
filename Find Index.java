class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int [] res = new int[2];
        res[0] = res[1] = -1;
        int lo = 0;
        int hi = nums.length - 1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>nums[mid]){
                lo = mid+1;
            }
            else if(target<nums[mid]){
                hi = mid-1;
            }
            else if(target == nums[mid]){
                res[0] = mid;
                hi = mid-1;
            }
        }
        lo = 0;
        hi = nums.length - 1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>nums[mid]){
                lo = mid+1;
            }
            else if(target<nums[mid]){
                hi = mid-1;
            }
            else if(target == nums[mid]){
                res[1] = mid;
                lo = mid+1;
            }
        }
        return res;
    }
}