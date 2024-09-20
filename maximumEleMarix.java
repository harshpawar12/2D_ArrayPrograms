package TwoD;

import java.util.Scanner;

public class maximumEleMarix {
	
	maximumEleMarix()
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
		System.out.println("Max in Matrix element");
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("max in matrix are:"+max);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maximumEleMarix n=new maximumEleMarix();

	}

}
