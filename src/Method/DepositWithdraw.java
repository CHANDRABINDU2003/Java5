
package Method;
class Bank{
    int serial;
    String name;
    float balance;
    

void insert(int s,String n,float b){
serial=s;
name=n;
balance=b;
}
void display(){
System.out.println(serial+" "+name+" "+balance);
}
void deposit(float amt){
balance=balance+amt;
System.out.println("deposited"+amt);  
}
void withdraw(float amt){
    balance=balance-amt;
    System.out.println("withdrawed"+amt);
}}
public class DepositWithdraw {
    public static void main(String[] args) {
        Bank a= new Bank();
        a.insert(345,"Udita",1000);
        a.display();
        a.deposit(25000);
        a.display();
        a.withdraw(15000);
        a.display();
        
    }
    
}
