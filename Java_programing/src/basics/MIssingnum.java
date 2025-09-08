package basics;

public class MIssingnum {

	public static void main(String[] args) {
	int arr[]= {0,1,2,3,5,6,7,8,9,10};
	for(int k=0;k<arr.length;k++) {
		boolean ispresent=check(arr, k);
		if(ispresent==false) {
			System.out.println("The Value "+k);
			break;
		}
	}
	}

	private static boolean check(int[] arr, int k) {
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]==k) {
				return true;
			}
         }
		return false;
	}
}
