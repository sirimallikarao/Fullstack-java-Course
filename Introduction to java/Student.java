class Student  
{ 
	int rollNo=123;//non-static
	String name="rahul";
	String address="delhi";
	static int id=333;
	 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//System.out.println(rollNo) error will come
		System.out.println(id);
		
		// create object 
		Student s = new Student();
		System.out.println(s.rollNo);
		System.out.println(s.name);
		
		//calling
		//sum(); as it is non static method we should use object while calling method also 
		// error will come as : non-static method sum() cannot be referenced from a static context
		
		s.sum();
		
		
	}
	//non-static or normal method 
	public void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		System.out.println(rollNo);
		System.out.println(id);
		

	} 
}