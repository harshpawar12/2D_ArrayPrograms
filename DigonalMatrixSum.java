package TwoD;

import java.util.Scanner;

public class DigonalMatrixSum {
	
	DigonalMatrixSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the row:");
		int row=sc.nextInt();
		System.out.println("Enter the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the eleemnt matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The sum of Diagonal matrix:");
		int sum=0;int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				
				 if(i==j)
				{
					sum+=i+j;
					c++;
					break;
				}
			}
			if(c==0)
			{
				
				System.out.println("Diagonal");
			}
			else
			{
				System.out.println("Not Diagonal.");
			}
			
		}
		System.out.println("sum is:"+sum);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigonalMatrixSum n=new DigonalMatrixSum();

	}

}
