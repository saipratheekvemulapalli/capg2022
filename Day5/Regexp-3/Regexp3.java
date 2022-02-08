package proj2;
import java.util.regex.*;

public class Regexp3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[1-9]*","9998888855551111"));
		System.out.println(Pattern.matches("\\d{10}","9981811252"));
		Pattern p=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("PRATHEEK@gmail.com");
		boolean b=m.matches();
		System.out.println(b);
		System.out.println(Pattern.matches("\\d{10}", "9988776655"));
		System.out.println(Pattern.matches("\\w+@\\w+\\.\\w+","pratheek@yahoocom"));
        System.out.println(Pattern.matches("\\s"," "));
        System.out.println(Pattern.matches("\\s","1"));
        System.out.println(Pattern.matches("\\S"," "));
        System.out.println(Pattern.matches("\\S","1"));
        System.out.println(Pattern.matches("\\D","a"));
        System.out.println(Pattern.matches("\\D","1"));
        System.out.println(Pattern.matches("\\d","a"));
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("[1-9]{2}", "35"));
        System.out.println(Pattern.matches("[amn]?","a"));
        System.out.println(Pattern.matches("[amn]?","aaa"));
        System.out.println(Pattern.matches("[amn]?","aaammmnn"));
        System.out.println(Pattern.matches("[amn]?","aazzta"));
        System.out.println(Pattern.matches("[amn]?","am"));
        System.out.println(Pattern.matches("[amn]+","a"));
        System.out.println(Pattern.matches("[amn]+","aaa"));
        System.out.println(Pattern.matches("[amn]*","aaaammmmmnnn"));
        
        
        
	}

}
