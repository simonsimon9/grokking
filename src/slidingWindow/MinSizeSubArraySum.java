package slidingWindow;
/**
 * 
 * Given an array of positive numbers and a positive number ‘S,’ 
 * find the length of the smallest contiguous subarray whose sum is greater 
 * than or equal to ‘S’. Return 0 if no such subarray exists.
 *
 */
public class MinSizeSubArraySum {
	 public static int findMinSubArray(int S, int[] arr) {
		 	int windowSum = 0, minLength = Integer.MAX_VALUE, windowStart = 0;
		 	for(int windowEnd = 0; windowEnd<arr.length;windowEnd++) { //window expand
		 		windowSum += arr[windowEnd]; 
		 		while(windowSum >= S) { //condition for contraction
		 			minLength = Math.min(minLength, windowEnd - windowStart + 1); //save the minimum
		 			windowSum -= arr[windowStart];
		 			windowStart++;//contraction
		 		}
		 	}
		 	return minLength == Integer.MAX_VALUE ? 0 : minLength;
	    }

	    public static void main(String[] args) {
	        int result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
	        System.out.println("Smallest subarray length: " + result);
	        result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
	        System.out.println("Smallest subarray length: " + result);
	        result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
	        System.out.println("Smallest subarray length: " + result);
	    }
}
