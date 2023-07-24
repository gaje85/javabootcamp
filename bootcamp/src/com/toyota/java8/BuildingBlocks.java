package com.toyota.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.toyato.training.Car;

public class BuildingBlocks {

	
	public BuildingBlocks() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1,"google",22342.23);
		Employee emp1 = new Employee(2,"ebay",42342.23);
		Employee emp2 = new Employee(3,"google",12342.23);
		Employee emp3 = new Employee(4,"ebay",62342.23);
		Employee emp4 = new Employee(5,"google",25342.23);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		System.out.println(empList);
		
		// find emps whose salary is > 25000 
		Predicate<Employee> salPredicate = (em) -> em.getSalary() > 25000;
		Predicate<Employee> salPredicateMetRef = 
				 this::findSalary;
		printEmp(empList, salPredicate);
		
		Predicate<Employee> googlePredicate = (em) -> em.getOrgName().equals("google");
		
		printEmp(empList, googlePredicate);
		// find google emp whose salary is > 25000 
		
		Predicate<Employee> googleAndSalPredicate = salPredicate.and(googlePredicate);
		printEmp(empList, googleAndSalPredicate);
		
		
		// Function fun 
		
		Function<Employee,Double> salFunc = (em) -> em.getSalary();
		
		// supplier 
		
		Supplier<Car> supplier = () -> new Car();
		
		Car car = supplier.get();
		
		// BinaryOperator 
		// find the total sum of salary of 2 emps
		BinaryOperator<Double> binOps = (one,two) -> one + two;
		
		Double res = binOps.apply(emp1.getSalary(), emp2.getSalary());
		System.out.println(res);
		
		UnaryOperator<Employee> unaryOperator = (em) -> {
			double sal = em.getSalary() + 200;
			emp.setSalary(sal);
			return emp;
		};
		
	//	find the total salary of google employees 
		
		Optional<Double> op = empList.stream()
									.filter(googlePredicate)
									.map(salFunc)
									.reduce(binOps);
		
		if(op.isPresent()) {
			Double res1 = op.get();
			System.out.println(res1);
		}
		
		
	}
	
	public  boolean findSalary(Employee emp) {
		
		return emp.getSalary() > 25000;
	}
	
	
	public void printEmp(List<Employee> empList,Predicate<Employee> predicate){
		/*for (Employee employee : empList) {
			if(predicate.test(employee)){
				System.out.println(employee);
			}
		}*/
		
		Consumer<Employee> cons = (employee) -> {
			if(predicate.test(employee)){
				System.out.println(employee);
			}
		};
		empList.forEach(cons);
		System.out.println("----------------------------");
	}
	public void printEmp(List<Employee> empList,Function<Employee,Double> function){
		for (Employee employee : empList) {
			Double sal = function.apply(employee);
				System.out.println(sal);
			
		}
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		BuildingBlocks bb = new BuildingBlocks();
	}
}
