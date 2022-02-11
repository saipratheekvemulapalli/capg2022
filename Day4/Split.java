package proj2;

public class Split {

	public static void main(String[] args) {
		String str = " hello   world";
		str = str.replaceAll(" +"," ");
		str =str.trim();
		System.out.println(str);

	}

}
