package Projectcarshowroommanagementsystem;
import java.util.*;
public class Employees extends Showroom implements utility{
String emp_id;
String emp_name;
int emp_age;
String emp_department;


public void getdetails() {
	System.out.println("Id: "+emp_id);
	System.out.println("Name: "+emp_name);
	System.out.println("Age: "+emp_age);
	System.out.println("Department: "+emp_department);
	System.out.println("Showroom Name: "+showroom_name);
}
public void setdetails() {
	Scanner sc=new Scanner(System.in);
	UUID uuid=UUID.randomUUID();
	emp_id=String.valueOf(uuid);
	System.out.println("============= *** ENTER EMPLOYEE DETAILS *** ==============");
	System.out.println();
	System.out.println("Employee Name: ");
	emp_name=sc.next();
	System.out.println("Employee Age");
	emp_age=sc.nextInt();
	sc.next();
	System.out.println("Employee Department: ");
	emp_department=sc.next();
	
	System.out.println("Showroom Name: ");
	showroom_name=sc.next();
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
