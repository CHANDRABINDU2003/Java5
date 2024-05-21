
package Aggration;
class address{
    String city;
    String district;
    String country;
    public address( String city,String district,String country){
        this.city=city;
        this.country=country;
        this.district=district;
    }
}

public class College {
    String name;
    int id;
    address add;
    public College(String name,int id,address add){
        this.add=add;
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(name+" "+id);
        System.out.println(add.city+" "+add.district+" "+add.country);
    }
    public static void main(String[] args) {
      address a1=new address("dumki","barisal","BD");
      address a2=new address("dumki","barisal","BD");
      College s1= new College("Udita",21,a1);
      College s2= new College("twaran",22,a2);
      s1.display();
      s2.display();
    }
   
}