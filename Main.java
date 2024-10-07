import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String output = new String();
    Scanner sc = new Scanner(System.in);
    Circle c1 = new Circle(10.1);
    Circle c2 = new Circle(14.0);
    Circle c3 = new Circle(20.5);
    output = c1.toString() + "\n" + c2.toString() + "\n" + c3.toString();
    System.out.println(output);
  }
}
