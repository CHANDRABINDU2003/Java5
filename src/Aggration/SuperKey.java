
package Aggration;
class emp{
    String name;
    int id;
    public emp(String name,int id){
        this.id=id;
                this.name=name;
    }
}
class deal extends emp{
    String sec;int num;
    public deal(String sec,int num,String name,int id){
        super(name,id);
        this.sec=sec;
        this.num=num;
        
        
    }
    void display(){
        System.out.println(name+" "+id+" "+sec+" "+num);
    }
}

public class SuperKey {
    public static void main(String[] args) {
        deal a= new deal("A",100,"udita",21);
        a.display();
        
    }
  
}
