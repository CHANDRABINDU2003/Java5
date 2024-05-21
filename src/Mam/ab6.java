
package Mam;
interface x{
    void on();
}
interface y extends x{
    void off();
}
class z implements y{
  public void on(){
        System.out.println("go");
    }
   public void off(){
        System.out.println("bye");
    }
}

public class ab6 {
    public static void main(String[] args) {
      z a = new z();
      a.off();
      a.on();
    }
}
