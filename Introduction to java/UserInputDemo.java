import java.util.Scanner;

class UserInputDemo

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name:");
		String fname=sc.next();
		
		System.out.println("Enter lastname");
		String lname=sc.next();
		
		String fullName=fname+lname;
		System.out.println(fullName);
	 
		  
		 
	} 
}
