package Alfiza;

import java.util.Scanner;

public class MyDate {
	int dd,mm,yy;
//default constructur
	MyDate(){
		dd=1;
		mm=1;
		yy=2000;
	}
	//Parameterized constructor
	MyDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	void display() {
		System.out.println(dd+"-"+mm+"-"+yy);
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter day:");
	 int d=sc.nextInt();
	 System.out.println("enter month:");
	 int m=sc.nextInt();
	 System.out.println("enter year:");
	 int y=sc.nextInt();
	 MyDate date=new MyDate(d,m,y);
	 System.out.println("Date:");
	 date.display();
	 sc.close();	  	 	  	 
	}

}
