import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scanner = new Scanner(System.in);
		do
		{
		System.out.println("Enter student age:");
		age = scanner.nextInt();
		}
		    while( age<=18);	     
		    System.out.println("Age  is >=18");
	}

}



