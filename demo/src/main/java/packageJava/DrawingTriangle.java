package packageJava;

import java.util.Scanner;

public class DrawingTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		      char triangleChar = '-';		
		      int triangleHeight = 0;		      
		
		      System.out.println("Enter a character:");
		
		      triangleChar = in.next().charAt(0);  
		
		      System.out.println("Enter triangle height:");
		
		      triangleHeight = in.nextInt();
		
		      System.out.println(" ");	
		       
		
		for (int i =0; i <= triangleHeight; i++)
		
		{for (int j = 0; j <= i; j++)
		
		{  
			System.out.print(triangleChar);	
		
		
		   } System.out.println( " ");
		
		  }		
		
		      return;


	}

}
