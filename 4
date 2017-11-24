class Solution {
    public static double max(double a,double b)
    {
        return a>b?a:b;
    }
    public static double min(double a,double b)
    {
        return a<b?a:b;
    }
    public static double medianSingle(int arr[], int n)
    {
        
        if (n%2 == 0)
            return (arr[n/2] + arr[n/2-1])/2.0;
        
        return arr[n/2];
    }
    public static double MedianOf3(int a,int b,int c)
    {
         return a + b + c - max(a, max(b, c))- min(a, min(b, c));
    }
    public static double MedianOf4(int a,int b,int c,int d)
    {
        double Max = max( a, max( b, max( c, d ) ) );
        double Min = min( a, min( b, min( c, d ) ) );
        return ( a + b + c + d - Max - Min ) / 2.0;
    }
    
    public static double findMedianSortedArraysUtil(int[] nums1, int M,int[] nums2,int N) {
      
        
       //case 1: if one of the array is empty
        if(M==0 || N==0)
        {
            if(M==0)
            {
                return medianSingle(nums2,N);
            }
        }
        //case 2: if both have 1 length
        if(M==1 && N==1)
        {
            return (nums1[0]+nums2[0])/2.0;
        }
        //case 3: a. if one of the length is 1 and other has odd numbers
        if(M==1 && N%2!=0)
        {
            double ans=MedianOf3(nums2[N/2 -1],nums2[N/2 +1],nums1[0]);
            //double ans=MedianOf3(nums2[N/2 – 1], nums2[N/2 + 1], nums1[0]) ;
            return (ans+nums2[N/2])/2.0 ;
        }
        //Case 3b
        if(N==1 && M%2!=0)
        {
            double ans=MedianOf3(nums1[M/2 -1],nums1[M/2 +1],nums2[0]);
            return (ans+nums1[M/2])/2.0 ;
        }
        
        //Case 4 : a. if one of the length is 1 and other has even numbers
        if(M==1 && N%2==0)
        {
            return MedianOf3(nums2[N/2 -1],nums2[N/2],nums1[0]);
            //return MedianOf3(nums2[N/2 – 1], nums2[N/2], nums1[0]) ;
            
        }
        //Case 4b
        if(N==1 && M%2==0)
        {
            return MedianOf3(nums1[M/2 -1],nums1[M/2],nums2[0]);
           //return MedianOf3(nums1[M/2 – 1], nums1[M/2], nums2[0]) ;
        }
        
        
        //case 5: both have 2 elements each
        if(M==2 && N==2)
        {
            return MedianOf4(nums1[0],nums1[1],nums2[0],nums2[1]);
        }
        
        //case 6: a. if one of the length is 2 and other has odd numbers
        if(M==2 && N%2!=0)
        {
            return MedianOf3(nums2[N/2],(int)max(nums1[0],nums2[N/2 -1]),(int)min(nums1[1],nums2[N/2 +1]));
            //return MedianOf3(nums2[N/2], max(nums1[0], nums2[N/2 – 1]), min(nums1[1], nums2[N/2 + 1]);
        }
        //case 6b
        if(N==2 && M%2!=0)
        {
            return MedianOf3(nums1[M/2],(int)max(nums2[0],nums1[M/2 -1]),(int)min(nums2[1],nums1[M/2 +1]));
            //return MedianOf3(nums1[M/2], max(nums2[0], nums1[M/2 – 1]), min(nums2[1], nums1[M/2 + 1]);
        }
                             
        //case 7: a. if one of the length is 2 and other has even numbers
        if(M==2 && N%2==0)
        {
            return MedianOf4(nums2[N/2], nums2[N/2 -1], (int)max(nums1[0], nums2[N/2 -2]), (int)min(nums1[1], nums2[N/2 +1]));
            //return MedianOf4(nums2[N/2], nums2[N/2 – 1], max(nums1[0], nums2[N/2 – 2]), min(nums1[1], nums2[N/2 + 1]));
        }
        //case 7b
        if(N==2 && M%2==0)
        {
            return MedianOf4(nums1[M/2], nums1[M/2 -1], (int)max(nums2[0], nums1[M/2 -2]), (int)min(nums2[1], nums1[M/2 +1]));
            //return MedianOf4(nums1[M/2], nums1[M/2 – 1], max(nums2[0], nums1[M/2 – 2]), min(nums2[1], nums1[M/2 + 1]));
        }
                             
        //Rest of the cases
        int idx1 = (M-1)/2 ;
        int idx2 = (N-1)/2 ;
        
        if(nums1[idx1]<=nums2[idx2])
        {
            nums1=Arrays.copyOfRange(nums1, idx1, M);
            return findMedianSortedArraysUtil(nums1,M/2 + 1,nums2, N-idx1);
        }
        else
        {
            nums2=Arrays.copyOfRange(nums2, idx1, N);
            return findMedianSortedArraysUtil(nums1,M/2 + 1,nums2, N-idx1);
        }
        

    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int high1=nums1.length;
        int high2=nums2.length;
        
        if(high1>high2)
            return findMedianSortedArraysUtil(nums2,high2,nums1,high1);
        else
            return findMedianSortedArraysUtil(nums1,high1,nums2,high2);
    }
}
