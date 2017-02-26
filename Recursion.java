class Recursion
{
public static void recursion (int n ) 
	{
		n--;
		System.out.println("A = " + n);
	
		if (n!=0) {recursion(n);}
		
		System.out.println("B = " + n);
	}
public static void main(String[] args) 
	{
	
	recursion(3);
	
	}
} 