import java.util.*;
public class DotComBust {
	//объявляем и инициализируем переменные которые нам понадобятся
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		//Создаем несколько "сайтов" и присвоим им адреса
		//Создаем три объекта дотком даем им имена и помещаем в аррейлист
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("Etoys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//Вводим краткие инструкции для пользователя
		System.out.println("Vasha cel potopit tri saita");
		
		for (DotCom dotComToSet : dotComsList) { // Повторяем с каждым объектом дотком в списке
			ArrayList<String> newLocation = helper.placeDotCom(3);// Запрашиваем у вспомагательного объекта адрес сайта
			dotComToSet.setLocationCells(newLocation);// вызываем сеттер из объекта дотком чтобы передать ему местоположение которое только что получили от вспомагательного объекта
		}	
	}
	
	private void startPlaying() {
		while (!dotComsList.isEmpty()) { ////до тех пор пока список объектов дотком не станет пустым
			String userGuess = helper.getUserInput("Sdelayte Hod");//получаем пользовательский ввод
			checkUserGuess(userGuess); // вызываем наш метод checkUserGuess
		}
		finishGame(); //вызываем наш метод finishGame
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++; // инкрементируем количество попыток которые сделал пользовательский
		String result = "Mimo";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourSelf(userGuess);
			if (result.equals("Popal")) {
				break;
			}
			if (result.equals("Potopil")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame() {
		System.out.println("Vse saiti yshli ko dny");
		if (numOfGuesses <= 18) {
			System.out.println("Eto zanyalo vsego " + numOfGuesses + " popitok");
		} else {
			System.out.println("Eto zanyalo dovolno mnogo vremeni. " + numOfGuesses + "popitok");
			System.out.println("Vse saiti yshli ko dny");
		}
	}
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
