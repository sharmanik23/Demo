package practicedemo;

import java.util.Arrays;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no");
		int f1= sc.nextInt();
		
		System.out.println("enter 2nd no");
		int f2= sc.nextInt();
		
		System.out.println("enter 3rd no");
		int f3= sc.nextInt();
		
		System.out.println("enter 4th no");
		int f4= sc.nextInt();
		
		System.out.println("enter 5th no");
		int f5=sc.nextInt();
		
		int number[]= {f1,f2, f3,f4, f5};
		
		 Arrays.sort(number);
		
		System.out.println("largest no "+ number[4]);
		System.out.println("smallest no "+ number[0]);
		

	}

}
