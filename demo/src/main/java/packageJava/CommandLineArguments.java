package packageJava;

public class CommandLineArguments {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		/*for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}*/
		//foreach loop
		for(String s:args) {
			System.out.println(s);
		}
		/*int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		System.out.println(i+j);*/
		System.out.println(args[0]+args[1]);

	}

}
