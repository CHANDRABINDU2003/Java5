
package Mam;
class superclass{
    int data1;
    public int getData1(){
        return data1;
    }
    public void setData1(int data1){
        this.data1=data1;
    }
}
class subclass extends superclass{
int data2;
public subclass(int data1,int data2){
    super.setData1(data1);
    this.data2=data2;
    
}
public int getData2(){
    return data2;
}
public void setData2(int data2){
    this.data2=data2;
}
public subclass(){
    this(0,0);
}
public String condition(){
    if(super.data1==10 && data2==15){
        return "true";
    }
    return "false";
    
}}

public class P2 {
    public static void main(String[] args) {
     subclass a= new subclass(10,15);  
        System.out.println(a.condition());
        
    }
    
}
