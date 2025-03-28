class IncrementOperator 
{
	public static void main(String[] args) 
	{
		
		int a=5;
		int b=7;
		
		int c = ++a + b++; //a=6 b==6 6+7=13
		System.out.println(c);//13
		System.out.println(a);//6
		System.out.println(b);//8
	}
}
