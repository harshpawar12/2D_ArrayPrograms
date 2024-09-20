
package TwoD;

import java.util.Scanner;

public class SymmetricMatrix {
	
	SymmetricMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		System.out.println("Enter the col:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the element in matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Symmetric matrix are:");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("Symmetric matrix");
				break;
			}
			else
			{
				System.out.println("not symmetric");
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricMatrix n=new SymmetricMatrix();

	}

}
