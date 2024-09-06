import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public class Java8StreamPractice {
public static void main(String[] args) {
         List<Employee> employeeList = new ArrayList<Employee>();

employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
 //find the deatils of highes paid emp in each dept

 Map<String, Optional<Employee>> x = employeeList.stream().collect(Collectors.groupingBy
 (Employee::getDepartment,
 Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

 x.forEach((a,b)->System.out.println("deptname"+a+"max salary"+b.get().getSalary()));

 List<Integer> list=Arrays.asList(2,1,3,4,5,9,8);
 int arr[]={2,1,3,4,5,9,8};
 System.out.println(list.stream().mapToInt(Integer::valueOf).sum());
 System.out.println(Arrays.stream(arr).sum());
 
}
}

class Employee {
        int id;
        String name;
        int age;
        String gender;
        String department;
        int yearOfJoining;
        double salary;
        public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getGender() {
            return gender;
        }
        public String getDepartment() {
            return department;
        }
        public int getYearOfJoining() {
            return yearOfJoining;
        }
        public double getSalary() {
            return salary;
        }
        @Override
        public String toString() {
            return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
                    + department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
        }
}
 

 