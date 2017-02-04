/*
	Программа, демонстрирующая примитивные типы
*/
class Bescon
{
	public static void main (String[] args)
	{
	// Минус Ноль
	double num =  -1.0/(1.0/0.0) ;
	System.out.println( "Минус Ноль = " + num);
	
	// Бесконечность
	num =  1.0/0.0 ;
	System.out.println("Бесконечность = " + num);
	
	// Минус Бесконечность
	num =  -1.0/0.0 ;
	System.out.println("Минус Бесконечность = " + num);
	
	// Not a number
	num =  Math.sqrt(-25) ;
	System.out.println("Not a number = " + num);
	
	}
}