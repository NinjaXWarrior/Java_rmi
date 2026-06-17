import java.util.*;
public class InputDemo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a text");
    String str = sc.nextLine();
    System.out.println("you have entered:" + str);
  }
}