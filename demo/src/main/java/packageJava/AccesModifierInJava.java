package packageJava;

public class AccesModifierInJava {
	public int i=1;
	  protected int k=2;
	  private int p=3;
	  int d=4;
	 
	  public void test1() {
	 
	  System.out.println("public void test1()");
	  }
	 
	  protected void test2() {
	 
	  System.out.println("protected void test2()");
	  }
	 
	  void test3() {
	 
	  System.out.println("void test3()");
	  }
	 
	  private void test4() {
	 
	  System.out.println("private void test4()");
	  }
	 

	public static void main(String[] args) {
		AccesModifierInJava obj = new AccesModifierInJava();
		 
		  obj.test1();
		  obj.test2();
		  obj.test3();
		  obj.test4();
		 
		  System.out.println(obj.i);
		  System.out.println(obj.k);
		  System.out.println(obj.p);
		  System.out.println(obj.d);

	}

}
