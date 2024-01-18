package Projectcarshowroommanagementsystem;
import java.util.*;

public class Showroom {
String showroom_name;
String showroom_address;
int total_employees;
int total_cars_in_stock=0;
String manager_name;

//@Override
public void getdetails() {
	System.out.println("Showroom Name: "+showroom_name);
	System.out.println("Showroom Address: "+showroom_address);
	System.out.println("Manager Name: "+manager_name);
	System.out.println("Total Employees: "+total_employees);
	System.out.println("Total Cars In Stock: "+total_cars_in_stock);
	
}
public void setdetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("============= *** Enter Showrroom Details *** =============");
	System.out.println();
	System.out.println("Showroom Name: ");
	showroom_name=sc.next();
	System.out.println("Showroom Address: ");
	showroom_address=sc.next();
	System.out.println("Manager Name: ");
	manager_name=sc.next();
	System.out.println("Total Employees: ");
	total_employees=sc.nextInt();
	System.out.println("Total Cars In Stock: ");
	total_cars_in_stock=sc.nextInt();
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
