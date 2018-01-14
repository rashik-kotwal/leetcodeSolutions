class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] table = new int[26];      //keeping the count of characters

        //initialize frequency of all characters
        for(int i=0;i<S.length();i++)
        {
            table[S.charAt(i)-'a']++;       //since all characters are lower case
        }

        Set<Character> mySet = new HashSet<Character>();        //Characters in the current window
        int low=0;
        int high=S.length()-1;
        int counter=0;      //signifies the number of unique characters in a window
        List<Integer> ans = new ArrayList<Integer>();
        int i=0;
        while(low<high)
        {
            if(!mySet.contains(S.charAt(low)))
            {
                mySet.add(S.charAt(low));

                counter++;
            }

                table[S.charAt(low)-'a']--;

            if(table[S.charAt(low)-'a']==0)
            {
                counter--;
                mySet.remove(S.charAt(low));
            }
            low++;
            //if exhausted all characters in the current window
            if(counter==0)
            {
                ans.add(low-i);
                i=low;
            }
        }
        ans.add(high-i+1);
        return ans;
    }
}
