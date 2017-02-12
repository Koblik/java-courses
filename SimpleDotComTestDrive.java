public class SimpleDotComTestDrive { 
	public static void main(String[] arg){ 
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		DotCom theDotCom = new DotCom();
		
		int randomNum = (int)(Math.random()*5);
		
		int[] locations = {randomNum,randomNum+1,randomNum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive == true) {
			String guess = helper.getUserInput("Vvedite chislo");
			String result = DotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("Potopil")) {
				isAlive = false;
			System.out.println("Vam potrebovalos "+numOfGuesses+" popitok");
			}
		}
		
		
	}
} 