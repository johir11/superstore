
package meenabazar;

import java.util.Scanner;

public class Product {
    String name;
    String id;
    int no_of_product=5;
    double price;
    boolean product_availity;
    
    Scanner input = new Scanner(System.in);
    
    public void input_id(){
        System.out.print("input id:");
        id= input.nextLine();
    }
    public void set_id(String id){
      this.id=id;
    }
    public String get_id(){
      return id;
    }
    public void print_id(){
        System.out.println("id is: "+id);
    }
    
    public void input_name(){
        System.out.print("input name:");
        name= input.nextLine();
    }
    public void set_name(String name){
      this.name=name;
    }
    public String get_name(){
      return name;
    }
    public void print_name(){
        System.out.println("Name is: "+name);
    }
    
    public void input_price(){
        System.out.print("input price:");
        price= input.nextDouble();
    }
    public void set_price(double price){
      this.price=price;
    }
    public double get_price(){
      return price;
    }
    public void print_price(){
        System.out.println("Price is: "+price);
    }
    
    public void input_no_of_product(){
        System.out.print("input no_of_product:");
        no_of_product = input.nextInt();
    }
    public void set_no_of_product(int nop){
        no_of_product = no_of_product-nop;
    }
    public Integer get_no_of_product(){
      return no_of_product;
    }
    public void print_no_of_product(){
        System.out.println("No_of_product is: "+no_of_product);
    }
}
