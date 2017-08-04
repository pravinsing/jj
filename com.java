//WAP  to Compute Quotient and Remainder 
import java.util.Scanner;
class compute
{
int a,b,d,e;
Scanner sc=new Scanner(System.in);
void qntrem()
{
System.out.println("Enter the number");
a=sc.nextInt();

System.out.println("Enter the number");
e=sc.nextInt();

b=a/e;
d=a%e;
System.out.println("quotient is"+b);
System.out.println("quotient is"+d);
}


}
public class com
{
public static void main(String[] args)
{
compute ab=new compute();
ab.qntrem();
}
}
