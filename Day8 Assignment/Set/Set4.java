package proj3;

import java.util.TreeSet;
import java.util.Iterator;

class Country1 {
	TreeSet<String> H1 = new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}

public class Set4 {

	public static void main(String[] args) {
		Country1 countries = new Country1();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");
		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));

	}

}
