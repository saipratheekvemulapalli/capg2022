package proj2;

class Data{
	public <E> void printArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}
	}
}
public class Generics1 {
	public static void main(String[] args) {
		Data data = new Data();
		String[] stringArray = { "One","two","Three"};
		Integer[] integerArray = {1,2,3,4};
		System.out.println("Printing String array");
		System.out.println("************");
		data.printArrayData(stringArray);
		System.out.println("Printing integer array");
		System.out.println("************");
		data.printArrayData(integerArray);
	}

}

