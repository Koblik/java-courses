class MovieTestDrive {
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "��� ��������� �� ������";
		one.genre = "������";
		one.rating = 3556;	
		
		Movie two = new Movie();
		two.title = "������� � ����";
		two.genre = "�����";
		two.rating = 1234;
		
		Movie three = new Movie();
		three.title = "����� � ����";
		three.genre = "�������";
		three.rating = 4678;
		
		int sum = (one.rating + two.rating + three.rating);
		System.out.println("��������� ������� ���� ������ = "+sum);
	}
} 