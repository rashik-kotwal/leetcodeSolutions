class Solution {
    public static int[] convertToArr(int N)
 {
     int x=0;
     int[] arr=new int[9];
     while(N>0)
     {
         arr[x++]=N%10;
         N=N/10;
     }
     
     int[] ans= new int[x];
     for(int i=0;i<ans.length;i++)
     {
         ans[i]=arr[i];
     }
     
     return ans;
 }
 public static int convertBackToNumber(int[] ans)
 {
     int a=0;
     for(int i=ans.length-1;i>=0;i--)
        {
            a=10*a+ans[i];
        }
     return a;
 }
 public static int monotoneIncreasingDigits(int N) {
         //convert to a in array first
        int[] ans=convertToArr(N);
        /*for(int i=0;i<ans.length;i++)
        {
             System.out.print(ans[i]+" ");
        }*/
        int i;
        boolean flag=true;
        boolean flag1=false;                        //this flag is suggests that we have to use the savedIndex at top of stack
        int[] stack = new int[10];
        int top=-1;
        //scan the digits from left to right(most significant to least significant)
        for(i=ans.length-1;i>=1;i--)
        {
            if(ans[i]<ans[i-1])
            {if(flag1)
                flag1=false;
            continue;}
            else
            {
                if((ans[i]==ans[i-1])&&!flag1)
                {
                    flag1=true;stack[++top]=i;continue;
                }
                else if((ans[i]==ans[i-1])&& flag1==true && ans[i]!=ans[stack[top]])
                {
                    stack[++top]=i;
                    continue;
                }
                else if((ans[i]==ans[i-1])&& flag1==true && ans[i]==ans[stack[top]])
                {
                    //stack[++top]=i;
                    continue;
                }
                else{
                    if(!flag1)
                    {//decrement the current digit and further all digits to 9
                    ans[i]--;
                    i--;
                    flag=false;
                        break;}
                    else
                    {
                        ans[stack[top]]--;
                        i=stack[top]-1;
                        flag=false;
                        break;
                    }
                }
            }
        }
        
        if(flag==false){
        for(int j=i;j>=0;j--)
        {
            ans[j]=9;
        }
        }
        else
        {
            //just return the number
            return N;
        }
        int a=convertBackToNumber(ans);
        return a;
    }
}

//important test cases which took time to clear:
      //int a= monotoneIncreasingDigits(999998);
       //int a= monotoneIncreasingDigits(668841);
       //int a= monotoneIncreasingDigits(556205);
       //int a= monotoneIncreasingDigits(666765);
