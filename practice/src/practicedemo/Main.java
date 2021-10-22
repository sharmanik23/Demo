package practicedemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter age");
		Scanner sc= new  Scanner(System.in);
		int age = sc.nextInt();
		
		if(age > 18) 
			System.out.println("adult");
		else
			System.out.println("not an adult");
			
			
		
		

	}

}
