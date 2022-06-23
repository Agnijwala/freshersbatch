import java.util.HashSet;

public class EmployeeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employee>act=new HashSet();
		Employee a=new Employee(1,"mani",30000,"Dev");
        Employee b=new Employee(2,"anil",20000,"Q/A");
        Employee c=new Employee(3,"sree",30000,"Dev");
        Employee d=new Employee(4,"chandu",50000,"Manager");
        act.add(a);
        act.add(b);
        act.add(c);
        act.add(d);
        //printing all the details of the objects
        System.out.println(act);
    }
}
class Employee{
	int id,salary;
    String name,dept;
    public Employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
	public void displayDetails() {
		System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
	}
    
}