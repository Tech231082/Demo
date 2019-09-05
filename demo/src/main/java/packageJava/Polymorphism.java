package packageJava;

public class Polymorphism {
	public int num1,num2;
	
	public static  void operation(int a,int b) {
		
		System.out.println(a+b);
		
		
	}
	public static void operation(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}

	public static void main(String[] args) {
		Polymorphism ob=new Polymorphism();
		
	ob.operation(3, 4);
		ob.operation(4,5, 6);

	}

}
