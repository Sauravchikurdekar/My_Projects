package arry;

import java.util.Arrays;

public class a {

	public static void main(String[] args) {

		int array[] = { -1, -9 - 8, 1, 9, 7, 78, -13 };


		Arrays.sort(array);
		int left=0;
		int right=array.length-1;
		int closestsum=Integer.MAX_VALUE;
		int minnum1=-1;
		int minnum2=-1;	
		while(left<right) {
			int sum=array[left]+array[right];
			int abssum=Math.abs(sum);
			
			if(abssum<closestsum) {
				closestsum=abssum;
				minnum1=left;
				minnum2=right;
				
			}
			if(sum<0) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println("closest number to o is: "+array[minnum1]+" and "+array[minnum2]);
	}
}