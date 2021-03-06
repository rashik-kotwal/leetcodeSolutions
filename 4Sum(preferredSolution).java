//O(n^3 solution) , in general : O(n^(k-1) complexity , here k=4 )

public List<List<Integer>> fourSum(int[] nums, int target)
{
	List<List<Integer>> res = new ArrayList<List<Integer>> ();
	
	if(nums ==null || nums.length < 4)
		return res;
	
	Arrays.sort(nums);
	int size =nums.length;
	
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			int newTarget =target - nums[i] - nums[j];
			
			int left = j+1;
			int right = size -1;
			
			while(left < right)
			{
				int sum =nums[left] + nums[right];
				
				if(sum == newTarget)
				{
					List<Integer> r = new ArrayList<Integer> ();
					r.add(nums[i]);
					r.add(nums[j]);
					r.add(nums[left]);
					r.add(nums[right]);
					res.add(r);
					
					int leftValue = nums[left];
					int rightValue = nums[right];
					left++;
					right--;
					
					while(left<size && nums[left]==leftValue)			//skip duplicates
						left++;
					while(right>j && nums[right]==rightValue)			//skip duplicates
						right--;
				}
				else if(sum< newTarget)
					left++;
				else
					right--;
			}
			
			while(j+1<size && nums[j+1]==nums[j])			//skip duplicates
						j++;
			
		}
		
		while(i+1<size && nums[i+1]==nums[i])			//skip duplicates
						i++;
		
	}
	
	return res;
		
}
