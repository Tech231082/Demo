package guru99Advanced;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=in.nextInt();
		System.out.println("enter second number");
		int b=in.nextInt();
		System.out.println("before swapping a="+a+",b="+b);
		int x=a;
		a=b;
		b=x;
		System.out.println("after swapping a="+a+","+ "b="+b);

	}

}
