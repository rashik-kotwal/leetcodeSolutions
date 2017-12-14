public static int findMin1(int arr[], int low, int high)
{
         //complexity would be increased to O(n) since we have to put while loops as below
         
     // This condition is needed to handle the case when array is not
    // rotated at all
    if (high < low)  return arr[0];
 
    // If there is only one element left
    if (high == low) return arr[low];
 
    // Find mid
    int mid = low + (high - low)/2; /*(low + high)/2;*/
 
    // Check if element (mid+1) is minimum element. Consider
    // the cases like {3, 4, 5, 1, 2}
    int index=mid;
    while(index < high)
    {
        if (arr[index+1] < arr[index])
            return arr[index+1];
        else if(arr[index+1] == arr[index])
            index++;
        else
            break;
    }
    index=mid;
    // Check if mid itself is minimum element
    while(index > low)
    {
        if (arr[index] < arr[index - 1])
            return arr[index];
        else if(arr[index-1] == arr[index])
            index--;
        else
            break;
    }
      
    // Decide whether we need to go to left half or right half
    if (arr[high] >= arr[mid])                                          //greater than equal to sign is very important
                                                                //think of simple case like:  1,3,3,3,3,3,4
       return findMin1(arr, low, mid-1);
    return findMin1(arr, mid+1, high);
}
    
    public static int findMin(int[] nums) {
        return findMin1(nums,0,nums.length-1);
    }
