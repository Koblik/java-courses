public class PoolPuzzleOne
{ 
	public static void main (String[] args) 
	{ 
		int x = 0; 	
		while ( x < 4 ) 
		{ 
			if (x<1){System.out.print("a "+"noise");}
			if (x>1){x = x+2;}
			if (x==1){System.out.print("annoys");}
			if (x>3){System.out.print("an "+"oyster");}
			System.out.println("");
			x = x + 1;		
		}
	} // ����� ������ main 
} // 