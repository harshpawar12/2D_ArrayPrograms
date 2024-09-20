package TwoD;

import java.util.Scanner;

public class freqMatrix{
	
	freqMatrix()
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the row:");
	int row=sc.nextInt();
	System.out.println("Enetr the col:");
	int col=sc.nextInt();
	int a[][]=new int[row][col];
	System.out.println("Enetr the elemnt is matrix:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Freq of matrix:");
	for(int i=0;i<a.length;i++)
	{
		int c=1;
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]==a[j][i])
			{
				c++;
				a[j][i]=1;
			}
			if(a[i][j]==1 && c!=a[i][j])
			{
				System.out.print(a[i][j]+" "+c);
			}
		}
		System.out.println();
		
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqMatrix s1=new freqMatrix();

	}

}
