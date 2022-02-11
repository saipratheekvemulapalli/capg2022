package proj2;
import java.util.Locale;

public class Local1 {

	public static void main(String[] args) {
		Locale locale1=new Locale("English","IN");
		System.out.println("Locale Name: "+ locale1);
		System.out.println("\nCountry Name: "+ locale1.getDisplayCountry());
		System.out.println("Country Name ISO 3166 2-letter code: "+locale1.getCountry());
		Locale locale2=Locale.getDefault();
		System.out.println("Local name Default :"+locale2);
		System.out.println("\nIs locale1 equal local2: "+ locale1.equals(locale2));
		Locale locale3= (Locale) locale2.clone();
		System.out.println("Locale locale3 same as locale2:"+locale3.equals(locale2));
		Locale[] locale4 = Locale.getAvailableLocales();
		System.out.println("\nInstalled locals are : ");
		for(int i=1;i<locale4.length/10;i++) {
			System.out.println(i+":"+locale4[i]);
			
		}
		System.out.println("\nlocale2 Language: "+locale2.getDisplayCountry());
		System.out.println("language of in Locale: "+ locale1.getDisplayLanguage(new Locale("France","French")));
		System.out.println("\nUse of getDisplayName : "+locale1.getDisplayName());
		System.out.println("Name of in Locale: "+ locale2.getDisplayLanguage(new Locale("English","english")));
		System.out.println("\nIS03 Country Name of locale3 :"+locale2.getISO3Country());

	}

}
