package exceptions;

public class ExceptionalHandling {

	public static void main(String[] args) {
		int a=12;
		int b=0;
		
		String str="String";
	    try {
	    	//int c=a/b;
	    	
	    		//int array[]= {1,2,3,4,5};
		    	//System.out.println(array[5]);
		    	
		    	System.out.println(str.charAt(6));
	    	}
	    catch(ArithmeticException e){
	    	System.out.println("Arithmetic exception caught "+e.getMessage());
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Array Index Out Of Bounds Exception caught "+e.getMessage());
    	}
	    catch(StringIndexOutOfBoundsException e) {
	    	System.out.println("String Index Out Of Bounds Exception caught "+e.getMessage());
	    }
		
		

	}

}
