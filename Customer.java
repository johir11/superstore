package meenabazar;
import java.util.Scanner;
public class Customer extends CommonSuperClass {
    String address;
    int customer_type;
    
    Scanner in = new Scanner(System.in);
    
    public void input_all(){
     
    }
    public void print_all(){
     
    }
    
    public void input_address(){
        System.out.print("input customer address:");
        address= in.nextLine();
    }
    public void print_address(){
        System.out.println("Customer address is: "+address);
    }
    
    public void input_customer_type(){
        System.out.println("Input 1 = Regular customer.\nInput 2 = member customre.");
        System.out.println("Input customer type : ");
        customer_type = in.nextInt();
    }
    public Integer get_customer_type(){
        return customer_type;
    }
    
    public double calculate_tax(double total_price){
        double tax = 0;
        tax = total_price * 0.02;
        return tax; 
    }
    public double calculate_discount(double total_price){
        double discount = 0;
        discount = total_price * 0.05;
        return discount;
    }
}
