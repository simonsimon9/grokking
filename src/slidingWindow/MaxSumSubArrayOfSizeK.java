package slidingWindow;

public class MaxSumSubArrayOfSizeK {

	
	public static int findMaxSumSubArray(int k, int[] arr) {
		//create the window start and end. 
		//create sum to keep track. Max and Window
        int windowStart = 0, maxSum = 0, windowSum = 0;
        
        //Sliding window expanding
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
        	//DP add to window SUM
        	windowSum+= arr[windowEnd];
        	//condition for contraction
        	if(windowEnd >= k-1) {
        		maxSum = Math.max(maxSum, windowSum); //check max SUM
        		windowSum -= arr[windowStart]; //contract window, update start
        		windowStart++;
        	}
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}

/*
public static int BrutefindMaxSumSubArray(int k, int[] arr) {
    int maxSum = 0, windowSum;
    for(int i = 0; i < arr.length-k;i++) {
    	windowSum = 0;
    	for(int j = i; j < i+k;j++) {
    		windowSum+=arr[j];
    	}
    	maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
*/