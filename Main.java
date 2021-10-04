package meenabazar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        
        String product_id = null,customer_id = null;
        double total_price_without_any_action = 0, total_price_with_tax = 0, total_price_with_discount = 0;
        int traceProductIndex = 0, traceCustomerIndex = 0, noOfProduct = 0;
        double discount = 0, tax = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of customer: ");
        int c = in.nextInt();
        System.out.println("Enter number of product: ");
        int p = in.nextInt();
        System.out.println("Enter number of salesperson: ");
        int s = in.nextInt();
        
        Product[] pro = new Product[p];
        Customer[] cus = new Customer[c];
        SalesPerson[] sp = new SalesPerson[s];
        
        for (int i = 0; i < c; i++) {
            System.out.println("Enter "+(i+1)+" no customer info: ");
            cus[i] = new Customer();
            cus[i].input_id();
            cus[i].input_name();
            cus[i].input_address();
            cus[i].input_customer_type();            
        }
        
        for (int i = 0; i < s; i++) {
            System.out.println("Enter "+(i+1)+" no salesperson info: ");
            sp[i] = new SalesPerson();
            sp[i].input_id();
            sp[i].input_name();
        }
        
        for (int i = 0; i < p; i++) {
            System.out.println("Enter "+(i+1)+" no product info: ");
            pro[i] = new Product();
            pro[i].input_id();
            pro[i].input_name();
            pro[i].input_price();
            pro[i].input_no_of_product();
        }
        System.out.println("\n\n\nYou are going to order System: ");
        while(true){
            System.out.println("Enter product id : ");
            in.nextLine();
            product_id = in.nextLine();
            for (int i = 0; i < p; i++) {
                if(pro[i].id.equals(product_id)){
                  traceProductIndex = i;  
                    if(pro[i].no_of_product>0){
                        System.out.println("Input number of buy: ");
                        noOfProduct = in.nextInt();
                        pro[i].set_no_of_product(noOfProduct);
                        total_price_without_any_action = noOfProduct * pro[i].price;                                
                    }
                    else{
                        System.out.println("This product is not available");                      
                    }
                    break;
                }
            }
            for (int i = 0; i < c; i++) {
                System.out.println("Enter customer id who has bought this product: ");
                in.nextLine();
                customer_id = in.nextLine();
                if(cus[i].id.equals(customer_id)){
                    traceCustomerIndex = i;
                    tax = cus[i].calculate_tax(total_price_without_any_action);                   
                    total_price_with_tax = total_price_without_any_action + tax;
                    int cus_type = cus[i].customer_type;
                    if(cus_type == 2){
                        discount = cus[i].calculate_discount(total_price_with_tax);
                        total_price_with_discount = total_price_with_tax - discount; 
                    }
                    else{
                        discount = 0;
                        total_price_with_discount = total_price_with_tax - discount;
                    }
                    break;
                }
            }
            System.out.println("Customer name is : "+cus[traceCustomerIndex].name);
            System.out.println("Customer id : "+cus[traceCustomerIndex].id);
            System.out.println("Bought Product name is : "+pro[traceProductIndex].name);
            System.out.println("Bought Product id is : "+pro[traceProductIndex].id);
            System.out.println("Number of this product: "+noOfProduct);
            System.out.println("Total price : "+total_price_with_discount);
            System.out.println("Discount: "+discount);
            System.out.println("Tax is : "+tax);
            
            System.out.println("\n\n\nDo you want to exit: y or n");
            String exit = in.nextLine();
            if(exit.equals("y")||exit.equals("Y")){
                break;
            }
            else{
                continue;  
            }           
        } 
    }
    
}
