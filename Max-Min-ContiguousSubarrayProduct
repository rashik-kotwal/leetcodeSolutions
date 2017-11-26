  public int maxProduct(int[] nums) {
        //O(n) solution : to either find the subarray with max/min product
        if(nums.length==0)
            return 0;
        int max_result=nums[0];
        //int min_result=nums[0];
        
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int temp=max;
            max=Math.max(Math.max(nums[i]*max,nums[i]*min),nums[i]);
            min=Math.min(Math.min(nums[i]*temp,nums[i]*min),nums[i]);
            
            if(max>max_result)
                max_result=max;
            /*if(min<min_result)
                min_result=min;*/
            
        }
        
        return max_result;
        //return min_result;
    }
