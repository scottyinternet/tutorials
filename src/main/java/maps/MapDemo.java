package maps;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		List<String> namesList = new ArrayList<>();

		namesList.add("Scott");
		namesList.add("Kaela");
		namesList.add("Jamie");
		namesList.add("Wells");
		namesList.add("Lena");
		namesList.add(2 , "Dresden");

		namesList.get(4);
		// access individual values in constant time using the INDEX

		Map<String, Integer> map = new HashMap<>();

		map.put("Scott" , 1);
		map.put("Kaela" , 4);
		map.put("Jamie" , 1);
		map.put("Wells" , 399);
		map.put("Lena" , 0);

//		System.out.println(map.get("asdf"));
//		System.out.println(map.getOrDefault("asdf", 1000));

		// access individual values in constant time using the KEY<T>

		// ANATOMY
		Set<String> keyset = map.keySet();
		Collection<Integer> values = map.values();
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

//		for(Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println(
//					entry.getKey() + " has " + entry.getValue() + " dogs in the room"
//			);
//		}




		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("1234", "Scott", "Engineer"));
		employeeList.add(new Employee("2345", "Kaela", "Engineer"));
		employeeList.add(new Employee("3456", "Jamie", "Stunts"));
		employeeList.add(new Employee("4567", "Wells", "Stunts"));
		employeeList.add(new Employee("5678", "Lena", "Baby"));
		employeeList.add(new Employee("6789", "Dresden", "Barking"));

		Map<String , List<Employee>> employeeByDepartmentMap = new HashMap<>();

		for (Employee employee : employeeList) {
			String department = employee.getDepartment();
			employeeByDepartmentMap.putIfAbsent(department, new ArrayList<>());
			employeeByDepartmentMap.get(department).add(employee);
		}


		HashMapPrinter.prettyPrint(employeeByDepartmentMap);















		// NUM OF EMPLOYEES BY DEPARTMENT
		Map<String, Integer> departmentCountMap = new HashMap<>();

		for (Employee employee : employeeList) {
			String department = employee.getDepartment();
			departmentCountMap.put(department, departmentCountMap.getOrDefault(department, 0) + 1);
		}
		//HashMapPrinter.prettyPrint(departmentCountMap);











		// EMPLOYEE BY ID
		Map<String, Employee> employeeByIdMap = new HashMap<>();

		for (Employee employee : employeeList) {
			employeeByIdMap.put(employee.getEmployeeId(), employee);
		}

		//HashMapPrinter.prettyPrint(employeeByIdMap);










//		Map<String, List<String>> departmentMap = new HashMap<>();
//
//		for (Employee employee : employeeList) {
//			if (!departmentMap.containsKey(employee.getDepartment())) {
//				departmentMap.put(employee.getDepartment(), new ArrayList<>());
//			}
//			departmentMap.get(employee.getDepartment()).add(employee.getName());
//		}
//
//		// employee by employee id
//		Map<String, String> employeeIdMap = new HashMap<>();
//		for (Employee employee : employeeList) {
//			employeeIdMap.put(employee.getEmployeeId() , employee.getName());
//		}
//
//
//		// employee by employee id
//		Map<String, Integer> departmentCountMap = new HashMap<>();
//		for (Employee employee : employeeList) {
//			departmentCountMap.put(
//					employee.getDepartment(),
//					departmentCountMap.getOrDefault(
//							employee.getDepartment(),
//							0
//					) + 1
//			);
//		}


	}
}
