package arry;

import java.util.Arrays;

public class New {

	
	
	    public static void main(String[] args) {
	        int[] array = {-1,-9-8,1,9,7,78,-13};
	        findClosestSumToZero(array);
	    }

	    public static void findClosestSumToZero(int[] array) {
	        if (array.length < 2) {
	            System.out.println("Array should contain at least two elements.");
	            return;
	        }

	        Arrays.sort(array); // Sort the array to make finding closest sum easier
	        int left = 0;
	        int right = array.length - 1;
	        int closestSum = Integer.MAX_VALUE;
	        int minSumIndex1 = -1;
	        int minSumIndex2 = -1;

	        while (left < right) {
	            int sum = array[left] + array[right];
	            int absSum = Math.abs(sum);

	            if (absSum < closestSum) {
	                closestSum = absSum;
	                minSumIndex1 = left;
	                minSumIndex2 = right;
	            }

	            if (sum < 0) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        System.out.println("Elements with the closest sum to zero: " + array[minSumIndex1] + " and " + array[minSumIndex2]);
	    }
	}


