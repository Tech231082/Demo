package staticOOps;

public class TestStatic {

	public static void main(String[] args) {
		//Car c=new Car();
		Nissan n=new Nissan();
		//c.start();
		n.start();//static methods are called by the name of class
		n.stop();
		main("Hello");
		TestStatic.main("Hello");

	}
	//main method can be overloaded 
	//overloaded main would not be called on their own,we have to call them directly or with classname
	public static void main(String args) {
		System.out.println("Main method overloaded");
	}

}
