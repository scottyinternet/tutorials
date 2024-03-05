package maps;

import java.util.Iterator;
import java.util.Map;

public class HashMapPrinter {
	public static <K, V> void prettyPrint(Map<K, V> map) {
		prettyPrint(map, "pretty printing");
	}

	public static <K, V> void prettyPrint(Map<K, V> map, String title) {
		System.out.println("\n - - - " + toSpacedUpper(title) + " - - - ");
		for (K key : map.keySet()) {
			V value = map.get(key);
			System.out.print(key + " = ");
			if (value instanceof Iterable<?>) {
				Iterable<?> iterableValue = (Iterable<?>) value;
				Iterator<?> iterator = iterableValue.iterator();
				System.out.println("{");
				while (iterator.hasNext()) {
					Object item = iterator.next();
					System.out.print("   " + item);
					if (iterator.hasNext()) {
						System.out.println(",");
					} else {
						System.out.println("\n}");
					}
				}
			} else {
				System.out.println(value);
			}
		}
		System.out.println(" - - - - - - end - - - - - - \n");
	}

	private static String toSpacedUpper(String input) {

		StringBuilder result = new StringBuilder();
		if (input == null || input.isEmpty()) {
			return "";
		}
		// Convert each character to uppercase and append with a space
		for (int i = 0; i < input.length(); i++) {
			result.append(Character.toUpperCase(input.charAt(i)));
			result.append(" ");
		}

		// Remove the trailing space
		result.deleteCharAt(result.length() - 1);

		return result.toString();
	}
}
