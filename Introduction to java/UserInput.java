import java.util.Scanner;
//if you dont use import this package then we get an error while taking input from user using scanner 

class UserInput  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value");
		int data = sc.nextInt();  //calling int 
		
		 System.out.println(data);
		 
	}
}
