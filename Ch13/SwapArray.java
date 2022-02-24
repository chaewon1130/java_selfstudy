package Ch13;

public class SwapArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		swapArray(arr);
	}
	
	public static void swapArray(int[][] arr) {
		int[] last = arr[arr.length - 1];
		for(int low = arr.length-1; low >0; low--) {
			arr[low] = arr[low - 1];
		}
		arr[0] = last;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}