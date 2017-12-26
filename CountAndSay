class Solution {
static String[] dp;
    public static String getSeq(String num)
    {
        //main logic here
        int counter=1;
        int i=0;
        char r;
        char prev=' ';
        StringBuilder sb= new StringBuilder();
        int j=0;
        while(j<num.length())
        {
            r= num.charAt(j);
            if(prev!=' ')
            {
                if(r==prev)
                {
                    counter++;
                }
                else
                {
                    String temp=Character.toString(prev);
                    //append to string counter + digit
                    sb.append(String.valueOf(counter)).append(temp);
                    counter=1;      //update counter for new number

                }
            }
           // num=num/10;
            j++;
            if(j==num.length())
            {
                String temp=Character.toString(r);
                sb.append(String.valueOf(counter)).append(temp);
            }

            prev=r;

        }

        return sb.toString();
    }

    public static String countAndSay(int n) {

        dp= new String[n+1];
        dp[1]="1";
      for(int i=2;i<=n;i++)
      {
          dp[i]=getSeq(dp[i-1]);
      }

       return dp[n];
    }
}
----------------------------------------------------------------------------------------------------------------------------------
//Following version was acceptable till n<=8 (because of processing Integers)
class Solution {
static int[] dp;
    public static int getSeq(int num)
    {
        //main logic here
        int counter=1;
        int i=0;
        int r;
        int prev=-1;
        StringBuilder sb= new StringBuilder();
        while(num>0)
        {
            r= num%10;
            if(prev!=-1)
            {
                if(r==prev)
                {
                    counter++;
                }
                else
                {
                    //append to string digit + counter, because we will have to reverse this string in the end
                    sb.append(String.valueOf(prev)).append(String.valueOf(counter));
                    counter=1;      //update counter for new number

                }
            }
            num=num/10;
            if(num==0)
                sb.append(String.valueOf(r)).append(String.valueOf(counter));
            prev=r;

        }

        return Integer.valueOf(sb.reverse().toString());
    }

    public static String countAndSay(int n) {
      
        dp= new int[11];
        dp[1]=1;
      for(int i=2;i<=n;i++)
      {
          dp[i]=getSeq(dp[i-1]);
      }

       return String.valueOf(dp[n]);
    }
}
