
package Encapsulation;
class cse{
    private String name;
    private int id;
    private float salary;
    private long interest;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public float getSalary(){
        return salary;}
    public void setSalary(float salary){
        this.salary=salary;
    }
    public long getInterest(){
        return interest;
    }
    public void setInterest(long interest){
        this.interest=interest;
    }
}

public class Varsity {
    public static void main(String[] args) {
        cse c= new cse();
        c.setName("UDITA");
        c.setId(210);
        c.setSalary(2102006f);
    c.setInterest(22345L);
        System.out.println(c.getName()+" "+c.getId()+" "+c.getSalary()+" "+c.getInterest());
    }
  
}
