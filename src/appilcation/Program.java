package appilcation;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("UserName ", "Maria");
		cookies.put("Email ", "maria@gmail.com");
		cookies.put("Phone ", "988040993");
		
		
		cookies.remove("Email ");
		cookies.put("Phone ", "999771033");
		
		System.out.println("Contem a 'Phone' Key: " + cookies.containsKey("Phone "));
		System.out.println("Phone number: " + cookies.get("Phone "));
		System.out.println("Email: " + cookies.get("Email " ));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("TODOS COOKIES: " );
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
