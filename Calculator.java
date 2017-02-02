/*
	����� ��������� �����������
*/
public class Calculator
{
	/*
		��������� ����������
	*/
	private int result;
	/*
		��������� ���������,
		@param params ��������� ������������.
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
		�������� ���������.
		@return ��������� ����������.
	*/
	public int getResult()
	{
		return this.result;
	}
		/*
		�������� ���������
		*/
	public void cleanResult()
	{
		this.result = 0;
	}
}
