import java.util.*;
class SortMas {
	
	public static void list(ArrayList<String> al) {
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
	
	public static Integer smallest(ArrayList<String> al) {
		String small = al.get(0);
		Integer smallIndex = 0;
		for(Integer i=0; i<al.size() ;i++){
			if (Integer.parseInt(al.get(i))< Integer.parseInt(small)){
				small = al.get(i);
				smallIndex = i;
			}
		}
	return smallIndex;	
	}
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		Integer lenMas = 10;
		//Integer item = 6;
		for(int i=0; i<lenMas ;i++){
		a.add(i,Integer.toString((int)(Math.random()*1000)));
		}
		list(a);
		
		/*String small = a.get(0);
		Integer smallIndex = 0;
		for(Integer i=0; i<a.size() ;i++){
			if (Integer.parseInt(a.get(i))< Integer.parseInt(small)){
				small = a.get(i);
				smallIndex = i;
			}
		}*/
		/*t i=0; i<a.size();i++){
			int smallest = i;
			for (int j=i+1;j < a.size(); j++) {
				if (Integer.parseInt(a.get(j)) < Integer.parseInt(a.get(smallest))) {
				smallest = j;	
				}
			}
		String temp =a.get(i);
		a[i] = a.get(smallest);
		a[smallest] = temp;
		} */
		/*Collections.shuffle(a);
		List winningCombination = a.subList(0, lenMas);
		Collections.sort(winningCombination);
		System.out.println("Otsortirovannyi massiv :");
		System.out.println(winningCombination);*/
		list(a);
		
	}
	
}