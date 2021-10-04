
package meenabazar;

import java.util.*;

public class CommonSuperClass {
    String name;
    String id;
    
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
    
}
