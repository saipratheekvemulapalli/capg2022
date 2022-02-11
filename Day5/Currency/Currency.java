package proj2;

import java.text.NumberFormat;
import java.util.Locale;
class InternalizationCurrency {
	void printCurrency(Locale locale) {
		double dbl = 10500.3245;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(dbl);
		System.out.println(currency+ "for the locale"+locale);	
	}
}
public class Currency {

	public static void main(String[] args) {
		InternalizationCurrency ic = new InternalizationCurrency();
		ic.printCurrency(Locale.UK);
		ic.printCurrency(Locale.US);
		ic.printCurrency(Locale.FRANCE);
	}

}
