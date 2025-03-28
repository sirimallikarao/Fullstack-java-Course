class OpDemo 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=7;
		int res = a++ + ++b - --a + b++ - a++;
		         // 5  + 8  - 4 + 7 - 4
		System.out.println(res);
	}
}
