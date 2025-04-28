package session7Shorting;

public class FindNumberOfRepitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]arr = {11,22,34,56,23,11};
		int num = 12;
//		int count = 0;
//		for(int x:arr) {
//			if (x == num) {
//				count++;
//			}
//		}
//		System.out.println(count);
		primeNumber(num);
	}
	public void sumReturn(int arr[], int n) {
		int count = 0;
		for(int i = 0; i>arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			System.out.println(count);
		}
	}
	public static void primeNumber(int x) {
		if ( x%2==0) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
	}
}
