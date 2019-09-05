package packageJava;

public class MyClass {

	public static void main(String[] args) {
		try{
			int[] num= {1,2,3,4,5};
			System.out.println(num[4]);
			
		}catch(Exception e) {
			System.out.println("Array out of bound");
			
		}
		finally {
			System.out.println("Try-Catch is finished");
		}
		
	}	

}
	
