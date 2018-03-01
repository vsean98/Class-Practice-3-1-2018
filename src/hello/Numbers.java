package hello;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println ("Please enter your number ");
		Scanner scanner=new Scanner(System.in);

        double  anwser=scanner.nextDouble();
		
		
		if (anwser%2==0 && anwser%3==0) {
			System.out.println("true");
		
	
		}else {
		System.out.println("false");
		}
		
		
		
		
	}

}
