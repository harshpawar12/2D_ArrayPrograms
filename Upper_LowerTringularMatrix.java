package TwoD;

import java.util.Scanner;

public class Upper_LowerTringularMatrix {
	/*
	 * 
1 0 0 											
4 5 0  // upperTringular<----->LowerTri---->1 2 3 
7 8 9 										0 5 6 
											0 0 9 


	 */
	Upper_LowerTringularMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the row:");
		int row=sc.nextInt();
		System.out.println("Enetr the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enetr the matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Upper Tringular matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i<j)
				{
					System.out.print("0"+" ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("Lower Tringular matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>j)
				{
					System.out.print("0"+" ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upper_LowerTringularMatrix n=new Upper_LowerTringularMatrix();

	}

}
