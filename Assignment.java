/*
	
*/
class Assignment
{
	public static void main (String[] args)
	{
	// 
	String txt = "Fantastic " ;
	String lang = "Java" ;
	txt += lang ; // ������������ � ������������ �����
	System.out.println( "���������� � ����������� ������: " + txt ) ;
	
	int sum = 10 ;
	int num = 20 ;
	sum += num ; // ����������� ��������� ( 10 + 20 = 30 )
	System.out.println( " ���������� � ����������� ����� �����: " + sum ) ;
	
	int factor = 5 ;
	sum *= factor ; // ����������� ��������� ( 30 x 5 = 150 )
	System.out.println( "��������� ��������� " + sum ) ;
	
	sum /= factor ; // ����������� ��������� ( 150 ? 5 = 30 )
	System.out.println( " ��������� �������: " + sum ) ;
	
	sum /= factor ; // ����������� ��������� ( 150 ? 5 = 30 )
	System.out.println( " ��������� �������: " + sum ) ;
	//
	
	}
}