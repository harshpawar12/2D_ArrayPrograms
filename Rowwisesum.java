package TwoD;

import java.util.Scanner;

public class Rowwisesum {
	
	Rowwisesum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Row");
		int row=sc.nextInt();
		System.out.println("Enetr the col:");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		System.out.println("--------------");
		int sum=0;int colsum=0,psum=0,secsum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					psum+=a[i][j]; //primary index sum
				}
				if(i+j==2)
				{
					secsum+=a[i][j];//secondary sum
				}
				sum+=a[i][j]; //rowwise sum
				colsum+=a[j][i];//col_wise sum

			}
		}
		System.out.println("Rowise sum is:"+sum);
		System.out.println("The col wisesum is:"+colsum);
		System.out.println("The primary sum is:"+psum);
		System.out.println("The secondary sum is:"+secsum);



		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rowwisesum r=new Rowwisesum();

	}

}
