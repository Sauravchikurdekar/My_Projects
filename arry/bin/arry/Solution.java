package arry;

public class Solution {
	    public static int Solution(int N,String S)
	    {
	        int count = 0;
	        int ones = 0;

	        for(int i=0;i<N;i++)
	        {
	            if(S.charAt(i) == '1')
	            {
	                ones++;
	            }
	        }

	        if(ones == 0)
	        {
	            count++;
	        }

	        count += (ones - 1);

	        return count;
	    }

	    public static void main(String[] args)
	    {
	        int N = 9;
	        String S = "01110110111";

	        System.out.println(Solution(N,S));
	    }
	}

