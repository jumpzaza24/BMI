import java.util.*;
class BMI{
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter Weight in KG => ");
      double w = sc.nextInt();
      System.out.print("Enter Hight in CM => ");
      double h = sc.nextInt();
	  double ht = h/100.00 ;
	  double sum = w/(ht*ht) ;
      System.out.print("BMI for your => "+sum);  
    }
}