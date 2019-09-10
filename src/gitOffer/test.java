public class Solution {
    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
           if(nums == null || nums.length == 0)
                     return -1;
            int end =0;
            int start = 0;
            int sum = 0;
            int res = Integer.MAX_VALUE;
        while(end < nums.length){
           sum +=nums[end];
           if(sum >= s){
              res = Math.min(res,end-start+1);
              //当扫描到数组和大于s时，从第一个元素逐次缩小数组大小，
                  //直到符合条件的最小子数组
              while(sum >= s && start <= end){   
                  res = Math.min(res,end-start+1);
                  sum-=nums[start];
                   start++;
                    }
                 }
           end++;  //当前子数组的和还小于s,end往后移
        }
        if(res == Integer.MAX_VALUE ){   //需要考虑溢出问题
           return -1;
        }
        return res;
    }
}
