/*
	Класс реализует калькулятор
*/
public class Calculator
{
	/*
		Результат вычисления
	*/
	private int result;
	/*
		Суммируем аргументы,
		@param params Аргументы суммирования.
	*/
	public void add(int ... params)
	{
		for (Integer param : params) {
			this.result += param;
		}
	}
	
	public void razn(int a, int b)
	{
		
			this.result = a - b;
		
	}
	
	public void del(int a, int b)
	{
		
			this.result = a / b;
		
	}
	
	public void umnoj(int a, int b)
	{
		
			this.result = a * b;
		
	}
	/*
		Получить результат.
		@return результат вычисления.
	*/
	public int getResult()
	{
		return this.result;
	}
		/*
		Очистить результат
		*/
	public void cleanResult()
	{
		this.result = 0;
	}
}
