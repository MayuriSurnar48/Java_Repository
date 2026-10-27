package AlfizaPakage;

import java.util.Scanner;

public class Numbers {
	int x;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int value=sc.nextInt();
		Number n=new Number();
		n.x=value;
		System.out.println("Value of x:"+n.x);
		sc.close();
		
	}

}
