public static List<List<Integer>> subsetsWithDup(int[] nums) {

        //O(n2^n) complexity
                
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<List<Integer>> ();
        // Run a loop for printing all 2^n
        // subsets one by one
        Set<List<Integer>> ans1 = new HashSet<List<Integer>> ();
        for (int i = 0; i < (1<<n); i++)
        {
            List<Integer> temp = new ArrayList<Integer> ();
            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    temp.add(nums[j]);

             Collections.sort(temp);                                    // Important : because the numbers in the set(combination) has to be unique
            ans1.add(temp);
        }

        ans = ans1.stream().collect(Collectors.toList());
        /*for(int i=0;i<ans1.size();i++)
        {
            ans.add(ans1.toArray(i));
        }*/
        return ans;
    }     
