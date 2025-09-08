package Arrays;

public class Arr {

	public static void main(String[] args) {
		int a[]= {1,4,5,6};
		int b[]= {9,2,3,7};
		int c[] =new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int k=0;k<b.length;k++) {
			c[k+a.length]=b[k];
		}
		for (int j=0;j<c.length;j++)
		{
		System.out.print(c[j]+" ");
		}
		// TODO Auto-generated method stub

}
}
