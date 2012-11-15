import java.util.Scanner;


public class paradox {
	public static int restrictedInput(Scanner scan){
		int dinMamma;
		
	
	do{
		System.out.println("oh noes");
		dinMamma = scan.nextInt();
	}while (dinMamma < 1 || dinMamma > 10);
	
	return dinMamma;
}}
