/*
	���������, ��������������� ����������� ����
*/
class Bescon
{
	public static void main (String[] args)
	{
	// ����� ����
	double num =  -1.0/(1.0/0.0) ;
	System.out.println( "����� ���� = " + num);
	
	// �������������
	num =  1.0/0.0 ;
	System.out.println("������������� = " + num);
	
	// ����� �������������
	num =  -1.0/0.0 ;
	System.out.println("����� ������������� = " + num);
	
	// Not a number
	num =  Math.sqrt(-25) ;
	System.out.println("Not a number = " + num);
	
	}
}