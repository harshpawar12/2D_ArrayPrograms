package TwoD;

import java.util.Scanner;

public class MultiplyTwoMatrices {
	MultiplyTwoMatrices()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		System.out.println("Enter the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		System.out.println("Enter the 1st elemennt in matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the 2nd elemennt in matrix:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("multiply of Two matrices:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				a[i][j]=a[i][j]*b[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyTwoMatrices m=new MultiplyTwoMatrices();
	}

}
