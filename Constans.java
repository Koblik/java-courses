/*
	Программа, демонстрирующая использование констант
*/
class Constans
{
	public static void main (String[] args)
	{
	// Константы для подсчета очков
	final int TOUCHDOWN = 6 ;
	final int CONVERSION = 1 ;
	final int FIELDGOAL = 3 ;	
	int td , pat , fg , total ;
	
	//Подсчет очков
	td = 4 * TOUCHDOWN ;
	pat = 3 * CONVERSION ;
	fg = 2 * FIELDGOAL ;
	total = ( td + pat + fg ) ;
	//Вывод вычисленной суммы
	System.out.println( "Очков всего: " + total ) ;
	}
}