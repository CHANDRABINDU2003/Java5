
package Aggration;

 class address{
    String city;
    String country;
    public address(String city,String country){
        this.city=city;
        this.country=country;
    }
}
public class Bank {
    String name;
    int id;
    address add;
    public Bank(String name,int id,address add){
        this.add=add;
        this.id=id;
        this.name=name;
    }
void display(){
    System.out.println(name+" "+id);
    System.out.println(add.city+" "+add.country);
}

    public static void main(String[] args) {
       address add1=new address("dhaka","BD");
       address add2= new address("kerala","india");
       Bank a1= new Bank("udita",21,add1);
       Bank a2= new Bank("twaran",22,add2);
       a1.display();
       a2.display();
        
    }
   
}
