import java.rmi.*; 
public class MyClient {
  public static void main(String[] args){
    try {

      Adder a = (Adder) Naming.lookup("rmi://localhost:5000/rmiserver");

      int s = a.add(70, 40);
      System.out.println("Sum = " + s);

    } catch(Exception e) {
     System.out.println("client side error... " + e);
    }
  }
}