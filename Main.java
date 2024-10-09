import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Problem 1");
    Scanner sc = new Scanner(System.in);
    String output = new String();
    Circle c1 = new Circle(10.1);
    Circle c2 = new Circle(14.0);
    Circle c3 = new Circle(20.5);
    output = "You have a " + c1.toString() + "\n" + "You have a " + c2.toString() + "\n" + "You have a " + c3.toString();
    System.out.println(output);

    System.out.println("Problem 2");
    double s;
    double l;
    double w;
    System.out.println("Etner your square side length!");
    s = sc.nextDouble();
    System.out.println("Enter your rectangle's length!");
    l = sc.nextDouble();
    System.out.println("Enter your rectangle's width!");
    w = sc.nextDouble();
    Rectangle r1 = new Rectangle(s);
    Rectangle r2 = new Rectangle(l,w);
    output = "You have a " + r1.toString()+ "\n" + "You have a " + r2.toString();
    System.out.println(output);

    System.out.println("Problem 3");
    double side; 
    System.out.println("Etner your side length!");
    side = sc.nextDouble();
    RegularPolygon t = new RegularPolygon(side);
    RegularPolygon sq = new RegularPolygon(4, side);
    output = "You have a " + t.toString()+ "\n" + "You have a " + sq.toString();
    System.out.println(output);
    
    sc.close();
  }
}
