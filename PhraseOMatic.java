public class PhraseOMatic
{ 
	public static void main (String[] args) 
	{ 
		String[] wordListOne = {"��������������", "����-�������", 
								"30000-�������", "��������", "�������� �������", "��������", 
								"�� ������ ���-����������", "����������", "�����", "����� ����", 
								"����� ������������ ����", "����������","���������������", "�����������������",
								"�����������","���������������"}; 
		String[] wordListTwo = {"��������������", "�������", "������ �������", "���������������", "�����������", 
								"��������������", "����������������", "���������", 
								"������������� ��", "�����������������", "�������", 
								"���������������", "�������������� � �������", "�����������", 
								"���������� ��", "�����", "����������", "����������"}; 
		String[] wordListThree = {"�������", "����� ���������", "����� �� ���������", "��� ���������", "������", 
								"������", "������� ������������ ��������", "������", "������ �������", 
								"�����", "�������", "����� ����������"}; 
		int oneLength = wordListOne.length; 
		int twoLength = wordListTwo.length; 
		int threeLength = wordListThree.length; 
		int randl = (int) (Math.random() * oneLength) ; 
		int rand2 = (int) (Math.random() * twoLength) ; 
		int rand3 = (int) (Math.random() * threeLength); 
		String phrase = wordListOne[randl] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; 
		System.out.println("���, ��� ��� �����, - ��� " + phrase); 
	} // ����� ������ main 
} // 