public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		
		
		boolean popitka = false; 
		int s = 0;
		while (true){
			int targetNumber = (int)(Math.random()*10);
			System.out.println("� ��������� ����� �� 0 �� 9 ...");
			System.out.println("����� ������� ����� �������, - " + targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("������ ����� ������, ��� ���  " + guessp1);
			guessp2 = p2.number;
			System.out.println("������ ����� ������, ��� ���  " + guessp2);
			guessp3 = p3.number;
			System.out.println("������ ����� ������, ��� ���  " + guessp3);
			
			s = s + 1;
			if (guessp1 == targetNumber){
				p1isRight = true;
			}
			if (guessp2 == targetNumber){
				p2isRight = true;
			}
			if (guessp3 == targetNumber){
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("� ��� ���� ����������!");
				if (p1isRight) {System.out.println("������ ����� ������ "+p1isRight);}
				if (p2isRight) {System.out.println("������ ����� ������ "+p2isRight);}
				if (p3isRight) {System.out.println("������ ����� ������ "+p3isRight);}
				System.out.println("�� " + s + " ���� ������� �� ���� ���������� !!!");
				System.out.println("����� ����.");
				break;
			} else {
				System.out.println("������ ������ ����������� ��� ���.");
			}
			if ((p1isRight == false) & (p2isRight == false) & (p3isRight == false)){
				popitka = true;
			}
			if (popitka) {
				System.out.println("����� " + s + " ������� ��� ���� �� ��������");
			}
		}
	}
	
	
} 