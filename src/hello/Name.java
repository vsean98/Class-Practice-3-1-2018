package hello;
import java.util.Scanner;
public class Name {

	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
        System.out.println ("Please enter your String ");
		String text=scanner.nextLine();
        System.out.println(method(text));
	}
		public static String method(String bat) {
		
		int c=bat.length();
	
		if(c%2==0) {
		return "true";
		
		}
		
		else 
		{
		
			return "false";
		
		
		
		
		}

		}
		
}
