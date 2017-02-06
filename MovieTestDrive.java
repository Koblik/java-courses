class MovieTestDrive {
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "Как прогореть на акциях";
		one.genre = "Боевик";
		one.rating = 3556;	
		
		Movie two = new Movie();
		two.title = "Торонто в огне";
		two.genre = "Драма";
		two.rating = 1234;
		
		Movie three = new Movie();
		three.title = "Просо в носу";
		three.genre = "Эротика";
		three.rating = 4678;
		
		int sum = (one.rating + two.rating + three.rating);
		System.out.println("Суммарный рейтинг трех картин = "+sum);
	}
} 