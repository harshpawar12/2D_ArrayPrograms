package TwoD;

import java.util.Scanner;

public class sumRowCol {
	sumRowCol()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the row:");
		int row=sc.nextInt();
		System.out.println("Enetr the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the ellemnt");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("");
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
				System.out.print(a[i][j]+" ");
				sum1+=a[j][i];
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of row:"+sum);
		System.out.println("Sum of col:"+sum1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumRowCol h=new sumRowCol();

	}

}
