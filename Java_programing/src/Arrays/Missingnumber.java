package Arrays;
public class Missingnumber {

	public static void main(String[] args) {
		int arr[]= {4,1,3,7,2,10,5,6};
		for(int k=1;k<=10;k++) {
			boolean ispresent =check(arr,k);
			if (ispresent==false) {
				System.out.println("value:"+k);			
				
			}
		}
		// TODO Auto-generated method stub

	}

	private static boolean check(int[] arr, int k) {
		
		for(int i =0;i<arr.length;i++) {
			if (arr[i]==k) {
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
