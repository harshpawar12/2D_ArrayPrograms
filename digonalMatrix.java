package TwoD;

import java.util.Scanner;

public class digonalMatrix {
	
	digonalMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		System.out.println("Enter the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Diagonal Matrix are:");
		int c=0;

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=j && a[i][j]!=0)
				{
					c++;
					break;
				}
				else if(i==j && a[i][j]==0)
				{
					c++;
					break;
				}
			}
			if(c==1)
			{
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Diagonal Matrix");
		}
		else
		{
			System.out.println("not diagonal");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digonalMatrix y=new digonalMatrix();

	}

}
