/*
	Программа, демонстрирующая использование констант
*/
class Arithmetic
{
	public static void main (String[] args)
	{
	// Константы для подсчета очков
	int num = 100 ;
	int factor = 20 ;
	int sum = 0 ;
	
	//Подсчет очков
	sum = num + factor ; // 100 + 20
	System.out.println( "Результат сложения: " + sum ) ;
	sum = num - factor ; // 100 - 20
	System.out.println( "Результат вычитания: " + sum ) ;
	//Вывод вычисленной суммы
	sum = num * factor ; // 100 x 20
	System.out.println( "Результат умножения: " + sum ) ;
	sum = num / factor ; // 100 ? 20
	System.out.println( "Результат деления: " + sum ) ;
	}
}