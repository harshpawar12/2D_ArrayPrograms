package TwoD;

public class SpiralMatrix {
//
	SpiralMatrix()
	{
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int left=0,right=a[0].length-1;
		int top=0,bottom=a[0].length-1;
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(a[i][right]+" ");
			}
			right--;
			if(top<=bottom)
			{
			for(int i=right;i>=left;i--)
			{
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			for(int i=bottom;i>=top;i--)
			{
				System.out.print(a[i][left]+" ");
			}
			left++;
			}
		}
		
	}

	public static void main(String[] args){
		
		SpiralMatrix d=new SpiralMatrix();
		

		
		
	}

}
