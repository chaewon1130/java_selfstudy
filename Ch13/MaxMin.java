package Ch13;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr = {7,4,1,8,5,2,9,6,3};
		System.out.println(minValue(arr));
		System.out.println(maxValue(arr));
	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int e : arr) {
			if(e > max) {
				max = e;
			}
		}
		return max;
	}
}