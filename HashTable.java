package hashtable;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> example1 = new Hashtable<>();

		// Initialization of a Hashtable
		Hashtable<Integer, String> example2 = new Hashtable<Integer, String>();

		// Inserting the Elements
		// using put() method
		example1.put(1, "Simarjit");
		example1.put(2, "Jagdeep");

		example2.put(3, "Jagdeep");
		example2.put(4, "Simarjit");

	
		System.out.println("Mappings of example1 : " + example1);
		System.out.println("Mappings of example2 : " + example2);

	}
}
