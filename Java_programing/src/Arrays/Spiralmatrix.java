package Arrays;

public class Spiralmatrix {

	public static void main(String[] args) {
		int[][] m = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		int top=0,bottom=2,left=0,right=2;
		while(top<=bottom&&left<=right)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.print(m [top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(m[i][right]+" ");
			}
				right--;
				if(top<=bottom) {
			
			for(int i=right;i>=left;i--) {
				System.out.print(m[bottom][i]+" ");
			}
				bottom--;
			
			if(left<=right) {
			for(int i=bottom;i>=top;i--) {
				System.out.print(m[i][left]+" ");
				left++;
			}
			}
			}
		}
		}
}