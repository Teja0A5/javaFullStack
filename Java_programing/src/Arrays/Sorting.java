package Arrays;

public class Sorting {
	public static void main(String[] args) {
		int a[]= {4,2,9,1,3,8};
		int temp=0;
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int k=0;k<a.length;k++)
		{
			System.out.println(a[k]+" ");
		}
		System.out.println();
		System.out.println(a[a.length-2]);
		// TODO Auto-generated method stub

	}

}
