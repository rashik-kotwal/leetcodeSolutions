class Solution {
    
    public int min(int a,int b)
    {
        return a<b?a:b;
    }
    public int nthUglyNumber(int n) {
    
        if(n <= 0) return n; // get rid of corner cases 
        if(n == 1) return n; // base case
        int t2 = 0, t3 = 0, t5 = 0; //pointers for 2, 3, 5
        int[] k= new int[n];
        k[0] = 1;
        for(int i  = 1; i < n ; i ++)
        {
            k[i] = min(k[t2]*2,min(k[t3]*3,k[t5]*5));
            if(k[i] == k[t2]*2) t2++; 
            if(k[i] == k[t3]*3) t3++;
            if(k[i] == k[t5]*5) t5++;
        }
        return k[n-1];

    }
    
}

Note: for cases like 6, need to increment both pointers t2 and t3
