import java.util.Scanner;
/**
	����� ��� ������� ������������. ����������� ���� ������������.
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
				System.out.println("�����:" + calc.getResult());
				calc.cleanResult();
				calc.razn(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("��������: " + calc.getResult());
				calc.cleanResult();
				calc.del(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("�������: " + calc.getResult());
				calc.cleanResult();
				calc.umnoj(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("������������: " + calc.getResult());
				System.out.println("Exit : yes/no ");
			}
		} finally {reader.close();}
	}
}
