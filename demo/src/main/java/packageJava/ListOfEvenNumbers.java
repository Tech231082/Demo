package packageJava;

import java.util.Scanner;

public class ListOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		System.out.println("Print even numbers between 1 and "+ limit);
		for(int i=1;i<=limit;i++) {
			if(i%2==0) {
				System.out.println(i+"");
			}
		}

	}

}
