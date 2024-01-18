package Projectcarshowroommanagementsystem;
import java.util.*;
public class Cars extends Showroom implements utility{
 String car_name;
 String car_color;
 int car_price;
 
 public void getdetails() {
	 System.out.println("Name: "+car_name);
	 System.out.println("Color: "+car_color);
	 System.out.println("Price: "+car_price);
	 
 }
 public void setdetails() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("============ *** ENTER CAR DETAILS *** ============");
	 System.out.println();
	 System.out.println("Car Name: ");
	 car_name=sc.next();
	 System.out.println("Car Color: ");
	 car_color=sc.next();
	 System.out.println("Car Price: ");
	 car_price=sc.nextInt();
	 total_cars_in_stock++;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
