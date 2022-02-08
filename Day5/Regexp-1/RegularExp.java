package proj2;
import java.util.regex.*;
public class RegularExp {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");  
		boolean b = m.matches(); 
		System.out.println(b);
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		System.out.println(b2);
		boolean b3 = Pattern.matches(".s", "as");   
		System.out.println(b3);

	}

}
