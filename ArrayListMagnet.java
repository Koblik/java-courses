import java.util.*;
public class ArrayListMagnet {
	public static void printAl(ArrayList<String> al){
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0,"nol");
		a.add(1,"odin");
		a.add(2,"dva");
		a.add(3,"tri");
		printAl(a);
		if (a.contains ("tri")) {
			a.add(4,"chetire");
		}
		a.remove(2);
		printAl(a);
		if (a.indexOf("chetire") !=4 ) {
			a.add(4,"4.2");printAl(a);
		}
		printAl(a);
	}
	
	
}
