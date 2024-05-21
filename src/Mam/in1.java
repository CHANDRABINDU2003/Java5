/*
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 – Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and 'department' respectively. Now,
assign name, age, phone number, address and salary to an employee and a manager by
making an object of both of these classes and print the same.
 */
package Mam;

import java.util.Scanner;
class member{
    String name,address;
    int num,age,salary;
    void print(){
        System.out.println(salary);
    }
}
class emp extends member{
    String special;
}
class manager extends member{
    String depart;
}
public class in1 {
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      int x=in.nextInt();
      emp a= new emp();
      manager b= new manager();
      for(int i=0;i<x;i++){
          System.out.println("give information for employee");
          a.name=in.next();
          a.address=in.next();
          a.age=in.nextInt();
          a.num=in.nextInt();
          a.salary=in.nextInt();
          a.special=in.next();
          System.out.println("print the information of employee"+a.address+" "+a.name+" "+a.special+" "+a.age+" "+a.num+" "+a.salary);
          System.out.println("give information for manager");
          b.name=in.next();
          b.address=in.next();
          b.age=in.nextInt();
          b.num=in.nextInt();
          b.salary=in.nextInt();
          b.depart=in.next();
          System.out.println("print the information of employee"+b.address+" "+b.name+" "+b.depart+" "+b.age+" "+b.num+" "+b.salary);
      }
    }
    
}
