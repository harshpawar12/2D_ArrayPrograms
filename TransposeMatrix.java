package TwoD;

import java.util.Scanner;

public class TransposeMatrix {
	TransposeMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the row:");
		int row=sc.nextInt();
		System.out.println("Enetr the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Transpose matrix:");
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
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransposeMatrix b=new TransposeMatrix();

	}

}
