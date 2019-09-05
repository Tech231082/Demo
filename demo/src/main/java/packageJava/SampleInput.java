package packageJava;

import java.util.Scanner;

public class SampleInput {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter num");
		int num=in.nextInt();
		int z=num*num;
		System.out.println("Square of numbers="+z);
		System.out.println("enter first name");
		String s1=in.next();
		System.out.println("enter last name\n");
		String s2=in.next();
		
		String now=s1+s2;
		System.out.println("Added strings"+now);
		System.out.println("eneter snntence");
		String s=in.nextLine();
		System.out.println(s);

	}

}
