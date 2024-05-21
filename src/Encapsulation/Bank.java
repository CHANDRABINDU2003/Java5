
package Encapsulation;
class account{
    private int id;
    private String name;
    private long salary;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(long salary){
        this.salary=salary;
    }
}
public class Bank {
    public static void main(String[] args) {
      account acc= new account();
      acc.setName("UDITA");
      acc.setId(210);
      acc.setSalary(560504000L);
        System.out.println(" "+acc.getName()+" "+acc.getId()+" "+acc.getSalary());
      
      
    }
   
}
