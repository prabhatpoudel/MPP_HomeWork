package lambdas_Streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program_4_2_A
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      //display all Employee, starting name with the letter J
      System.out.println("*******Name stating with letter J*****");
      Predicate<Employee> nameWithJ = e-> (e.getFirstName()).startsWith("J");
      list.stream().filter(nameWithJ).forEach(System.out::println);
      
      //Display the number of last names that begin with letter 'B'
      System.out.println("\n 1.Display the number of last names that begin with letter 'B'");
      System.out.println(list.stream().filter(e->e.getLastName().startsWith("B")).count());
      
      //Print out all the employeee objects whose last name begins with the letter 'B' in the sorted order
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;
      Function<Employee, String> byDepartment = Employee::getDepartment;
      Function<Employee, Double> bySalary = Employee::getSalary;
      
      Comparator<Employee> sortOrder = 
    	         Comparator.comparing(byLastName).thenComparing(byFirstName).thenComparing(byDepartment).thenComparing(bySalary);
      
      System.out.println("\n 2.Display all the employeee objects whose last name begins with the letter 'B' in the sorted order:");
      list.stream().filter(e->e.getLastName().startsWith("B")).sorted(sortOrder).forEach(System.out::println); 
      
      //Print out all of the Employee objects whose last name begins with the letter  �B�  
      //and change their first name and last name to be All capital letters
      System.out.println("\n 3.Display all the employeee objects whose last name begins with the letter 'B' in Upper Case:");
     list.stream().filter(e->e.getLastName().startsWith("B")).forEach(
    		 e->System.out.println(new Employee(e.getFirstName().toUpperCase(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment())));
     
     //Print out All of the employee objects, but if the last name begins with the letter  �B�,  
     //then capitalize all the letters in the last name.  
     
     System.out.println("\n 4.Display all the employeee objects but whose last name begins with the letter 'B' in Upper Case:");
     list.stream().forEach(
    		               e->
    		               {
    		            	   if (e.getLastName().startsWith("B"))
    		            	   {
    		            		   System.out.println
       		                    (new Employee(e.getFirstName(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment()));
    		            	   }
    		            	   else 
    		            		   System.out.println
          		                    (new Employee(e.getFirstName(),e.getLastName(),e.getSalary(),e.getDepartment()));
       		            	   
    		            	   
    		               }
    		              );
     //Print out all of the Employee objects� last names, whose last name begins with the letter  �I�  in sorted order, 
     //and get rid of all the duplicates.  Print out only the last names. 
     System.out.println("\n 5. Display all the Employee objects whos last name begins with the letter I and get rid of the duplicates:");
     list.stream().filter(e->e.getLastName().startsWith("I")).map(e->e.getLastName()).distinct().sorted().forEach(System.out::println);
     
     //Print out the average of all the salaries.
     System.out.println("\n 6. Display Average of all the salaries:");
     System.out.println(list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
     
     //Print out the total salary of the employee:
     System.out.println("\n 7. Total Salary of all the employee: ");
     System.out.println(list.stream().mapToDouble(Employee:: getSalary)
     .reduce(0,(value1,value2)-> value1+value2));
     
     //Print out the first names of all the employees. 
     // Use the map method to accomplish this
     System.out.println("\n 8. Display all the first names of employee: ");
     list.stream().map(Employee:: getFirstName).forEach(System.out::println);
     
     //Use the reduce method to find and later print out the total of all salaries.
     System.out.println("\n 9. Reduce Method to find and later print out the total of All Salaries:  ");
     double totSalaries = list.stream().mapToDouble(Employee:: getSalary).reduce(0, (value1,value2)-> value1+value2);
     System.out.println(totSalaries);
     
     //Create an infinite stream of even numbers (0, 2, 4, �) and then, 
     //eventually print out only the first 20 even numbers from this stream
     System.out.println("\n 10. Generate first 20 even number: ");
     IntStream.iterate(0, n->n+2).limit(20).forEach(System.out::println);
//     IntStream.generate(() -> 2).limit(20).forEach(System.out::println);
 /*
      
      // display all Employees
      System.out.println("Complete Employee list:");
      
     
      // Predicate that returns true for salaries in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
       
      // Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.printf(
         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
      list.stream()
          .filter(fourToSixThousand)
          .sorted(Comparator.comparing(Employee::getSalary))
          .forEach(System.out::println);

      // Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());

      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;

      // Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFirst = 
         Comparator.comparing(byLastName).thenComparing(byFirstName);

      // sort employees by last name, then first name 
      System.out.printf(
         "%nEmployees in ascending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst)
          .forEach(System.out::println);

      // sort employees in descending order by last name, then first name
      System.out.printf(
         "%nEmployees in descending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst.reversed())
          .forEach(System.out::println);

      // display unique employee last names sorted
      System.out.printf("%nUnique employee last names:%n");
      list.stream()
          .map(Employee::getLastName)
          .distinct()
          .sorted()
          .forEach(System.out::println);

      // display only first and last names
      System.out.printf(
         "%nEmployee names in order by last name then first name:%n"); 
      list.stream()
          .sorted(lastThenFirst)
          .map(Employee::getName)
          .forEach(System.out::println);

      // group Employees by department
      System.out.printf("%nEmployees by department:%n"); 
      Map<String, List<Employee>> groupedByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));
      groupedByDepartment.forEach(
         (department, employeesInDepartment) -> 
         {
            System.out.println(department);
            employeesInDepartment.forEach(
               employee -> System.out.printf("   %s%n", employee));
         }
      );

      // count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n"); 
      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));
      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));

      // sum of Employee salaries with DoubleStream sum method
      System.out.printf(
         "%nSum of Employees' salaries (via sum method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .sum());

      // calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
         "Sum of Employees' salaries (via reduce method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .reduce(0, (value1, value2) -> value1 + value2));  

      // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .average()
             .getAsDouble()); */     
   } // end main
} // end class ProcessingEmployees

