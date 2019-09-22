public int jump(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        
        return minJump(nums);
    }
    
    private int minJump(int[] nums) {
        int jump = 1;
        int curIdx = 0;
        int nextIdx = curIdx;
        while (true) {
            if(nums[curIdx] + curIdx < nums.length - 1) {
                int maxDis = 0;
                for (int j = 1; j <= nums[curIdx]; j++) {
                    if (nums[curIdx + j] + curIdx + j > maxDis) {
                        maxDis = nums[curIdx + j] + curIdx + j;
                        nextIdx = curIdx + j;
                    }
                }
                curIdx = nextIdx;
                jump++;
            } else {
                break;
            }
        }
        
        return jump;
    }
}
