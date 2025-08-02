package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
	String name;
	String dept;
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}

public class Task5in3 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("Diana", "Finance"));
        employees.add(new Employee("Ethan", "IT"));
        
        Map<String, List<Employee>> deptMap = new HashMap<>();
        
        for(Employee emp : employees) {
        	deptMap.computeIfAbsent(emp.dept, k -> new ArrayList<>()).add(emp);
        }
        
        for(Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
        	System.out.println(entry.getKey() + " " + entry.getValue());
        }

	}

}
