import java.util.Scanner;
/**
	Класс для запуска калькулятора. Подерживает ввод пользователя.
*/
public class InteractRunner
{
	public static void main(String[] arg)
	{
		Scanner reader = new Scanner(System.in);
		try 
		{
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes"))
			{
				System.out.println("Enter first arg:");
				String first = reader.next();
				System.out.println("Enter second arg:");
				String second = reader.next();
				calc.add(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("Сумма:" + calc.getResult());
				calc.cleanResult();
				calc.razn(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("Разность: " + calc.getResult());
				calc.cleanResult();
				calc.del(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("Деление: " + calc.getResult());
				calc.cleanResult();
				calc.umnoj(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("Произведение: " + calc.getResult());
				System.out.println("Exit : yes/no ");
			}
		} finally {reader.close();}
	}
}
