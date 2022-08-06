package twoPointers;

public class PairWithTargetSum {



		  public static int[] search(int[] arr, int targetSum) {
			  int l = 0 , r = arr.length - 1;
			  while(r > l) {
				  int total = arr[l] + arr[r];
				  if(total == targetSum) {
					  break;
				  }else if(total > targetSum) {
					  r--;
				  }else {
					  l++;
				  }
			  }
			  return new int[] {l,r};
		  }

		  public static void main(String[] args) {
		    int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
		    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
		    result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
		    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
		  }
		

}
