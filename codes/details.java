import java.util.Scanner;

public class details
{
String name;
String fname;
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("my name is");
name=sc.nextLine();

System.out.println("my friendname is");
fname=sc.nextLine();
 }
public static void main(String[]args)
{
details ab=new details();
ab.accept();
}
}