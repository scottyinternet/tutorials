package maps;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		//  L I S T   B A S I C   F  U N C T I O N S
		List<String> list = new ArrayList<>();

		list.add("Scott");  // O(1)
		list.add("Kaela");
		list.add("Jamie");
		list.add("Wells");
		list.add("Lena");
		list.add(2 , "Dresden");  // O(n)

		list.get(4);  // O(n) - access individual values in constant time using the INDEX
		list.remove(1);  // O(n)


		//  M A P   B A S I C   F U N C T I O N S
		Map<String, Integer> map = new HashMap<>();

		map.put("Scott" , 1);  // O(1)  -  "constant time"
		map.put("Kaela" , 4);
		map.put("Jamie" , 1);
		map.put("Wells" , 399);
		map.put("Lena" , 0);
		map.put("Wells" , 400);  // overwrites previous key value pair


		map.get("Lena");  // O(1) - access individual values in constant time using the KEY
		map.remove("Scott");  // O(1)


		//  H A S H M A P   A N A T O M Y
		Set<String> keyset = map.keySet();  // returns set of keys
		Collection<Integer> values = map.values();  // returns collection of values
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();  // returns set of key value pairs stored in Entry inner class

		//  iterating over entries (key value pair containers)
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();  //  returns key of individual entry
			Integer value = entry.getValue();  //  returns value of individual entry
			String dogOrDogs = value == 1 ? "dog" : "dogs";

			System.out.println(key + " has " + value + " " + dogOrDogs + " in the room");
		}


		//  O V E R   S I M P L I F I E D   M A P   E N T R Y   I N N E R   C L A S S
		/**
		 * This is an over simplifed version of a Map.Entry inner class implementation
		 * Check out the Node inner class within the HashMap class (line 280)
		 */
		class simplifiedEntry <K, V> {
			private final K key;
			private final V value;

			public simplifiedEntry(K key, V value) {
				this.key = key;
				this.value = value;
			}

			public K getKey() {
				return key;
			}

			public V getValue() {
				return value;
			}
		}


		//  - - - - - - - - - B U I L D I N G   H A S H M A P S   E X E R C I S E S - - - - - - - - -
			// List of employees meant to represent raw data. Imagine this list is much larger in size.
			List<Employee> employeeList = new ArrayList<>();

			employeeList.add(new Employee("1234", "Scott", "Engineer"));
			employeeList.add(new Employee("2345", "Kaela", "Engineer"));
			employeeList.add(new Employee("3456", "Jamie", "Stunts"));
			employeeList.add(new Employee("4567", "Wells", "Stunts"));
			employeeList.add(new Employee("5678", "Lena", "Baby"));
			employeeList.add(new Employee("6789", "Dresden", "Barking"));
			employeeList.add(new Employee("7890", "Noah", "Engineer"));
			employeeList.add(new Employee("8901", "Kent", "Stunts"));
			employeeList.add(new Employee("9012", "Colt", "Stunts"));
			employeeList.add(new Employee("0123", "Dorito", "Barking"));



		//  T A S K   1   -   E M P L O Y E E   B  Y   I D
			// create a map of employees using their employeeId as a key

			// task 1 solution 1
			Map<String, Employee> employeeByIdMap = new HashMap<>();

			for (Employee employee : employeeList) {
				employeeByIdMap.put(employee.getEmployeeId(), employee);  // using employeeId as key
			}

			HashMapPrinter.prettyPrint(employeeByIdMap, "employee By Id Map");


		//  T A S K   2   -   E M P L O Y E E   C O U N T   B Y   D E P A R T M E N T
			// create a map of employees using their employeeId as a key

			//  task 2 solution 1 - "containsKey" method
			Map<String, Integer> departmentCountMap1 = new HashMap<>();

			for (Employee employee : employeeList) {
				String department = employee.getDepartment();  			// use employee department as key
				if(!departmentCountMap1.containsKey(department)) {  		// check if map already contains key
					departmentCountMap1.put(department, 1);             // first encounter of this key, so count is 1
				} else {														// else if key already exists
					int numOfEmployees = departmentCountMap1.get(department);   // get current count of entries
					numOfEmployees++;											// increment by one to account for this entry
					departmentCountMap1.put(department, numOfEmployees);		// put overwrites the existing key value pair
				}
			}
			HashMapPrinter.prettyPrint(departmentCountMap1, "department count - contains key");


			//  task 2 solution 2 - "getOrDefault" method
			Map<String, Integer> departmentCountMap2 = new HashMap<>();

			for (Employee employee : employeeList) {
				String department = employee.getDepartment();
				int numOfEmployees = departmentCountMap2.getOrDefault(department, 0) + 1;
				departmentCountMap2.put(department, numOfEmployees);
			}

		HashMapPrinter.prettyPrint(departmentCountMap1, "department count-get or default");



		//  T A S K   3   -   EACH   E M P L O Y E E S   I N   D E P A R T M E N T
			// create a map contain a list of each employee in each department

			// task 3 solution 1 - "putIfAbsent" method
			Map<String , List<Employee>> employeeByDepartmentMap1 = new HashMap<>();

			for (Employee employee : employeeList) {
				String department = employee.getDepartment();
				employeeByDepartmentMap1.putIfAbsent(department, new ArrayList<>());
				employeeByDepartmentMap1.get(department).add(employee);
			}
		HashMapPrinter.prettyPrint(employeeByDepartmentMap1, "list of employees by departmentr");



		//  C O M M O N   M A P   M E T H O D S

			// CONSTRUCTOR BREAKDOWN
				// Map        - The interface being implemented, serving as the reference variable type.
				// <String,   - Key type parameter (in this case, String).
				// Integer>   - Value type parameter (in this case, Integer).
				// methodMap  - Reference variable name.
				// =          - Assignment operator.
				// new        - Keyword indicating the creation of a new object.
				// HashMap<>  - Concrete implementation of the Map interface, indicating the type of object being instantiated.
			Map<String, Integer> methodMap = new HashMap<>();

			// put methods
			methodMap.put("Test" , 200);    // Inserts a key-value pair into the map. If the map already contains the specified key, the previous value associated with the key is replaced  -  O(1) "constant time"
			methodMap.putIfAbsent("Test", 400); // If the specified key is not already associated with a value (or is mapped to null) associates it with the given value  -  O(1) "constant time"
			methodMap.putAll(map);          // Copies all of the mappings from the specified map to this map  -  O(n)

			// get methods
			methodMap.get("Test");			// Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key  -  O(1) "constant time"
			methodMap.getOrDefault("notKey" , 300);  //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key  -  O(1) "constant time"

			// information methods
			methodMap.containsValue(200); 	// Returns true if this map maps one or more keys to the specified value  -  O(n) "linear time"
			methodMap.size();   			// Returns the number of key-value mappings in this map - O(1) "constant time"

			// collection methods
			methodMap.keySet();             // Returns a Set view of the keys contained in the map  -  O(1) "constant time"
			methodMap.values();				// Returns a Collection view of the values contained in the map  -  O(1) "constant time"
			methodMap.entrySet();			// Returns a Set view of the key-value mappings contained in the map  -  O(1) "constant time"

			// "entry" inner class methods
			Map.Entry<String, Integer> entry;
			//entry.getValue();				// Retrieve the value associated with this entry
			//entry.getKey();				// Retrieve the key associated with this entry
			//entry.setValue(100);			// Set a new value for this entry

			// delete methods
			methodMap.remove("Test");	// Removes the mapping for a key from this map if it is present - O(1) "constant time"
			methodMap.clear();				// Removes all of the mappings from this map - O(1) "constant time"
	}
}
