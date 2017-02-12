import java.util.*;
class BinarySearch {
	//
	public static void list(ArrayList<String> al) {
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Integer lenMas = 128;
		Integer item = 6;
		for(Integer i=0; i<lenMas ;i++){
		a.add(i,Integer.toString(i*2));
		}
		list(a);
		//Integer dlina = a.size();
		System.out.println(Integer.toString(a.size()));
		
		Integer low = 0;
		Integer high = a.size() - 1;
		int k = 0;
		while (low <=high) {
			k = k + 1;
			Integer mid = (int)((low + high)/2);
			String guess = a.get(mid);
			System.out.println("Za "+guess);
			if (Integer.parseInt(guess) == item ){
				System.out.println("Za " + k + " popitok nashli chislo = " + Integer.toString(item) + " Pozition = "+ Integer.toString(mid));
			}
			if (Integer.parseInt(guess) > item ) {
				high = mid - 1;
			} else {low = mid +1; }
			
		}
	}
}