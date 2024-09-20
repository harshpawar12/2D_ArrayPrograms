package TwoD;

import java.util.Scanner;

public class sadlePoint {
	
	sadlePoint()
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
	System.out.println("sadle of matrix:");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sadlePoint d=new sadlePoint();

	}

}
