//WAP to calculate the Simple Interest
//WAP to find the average of 5 numbers.
import java.util.Scanner;
class simple
{
int a,p,r,t,i;
Scanner sc=new Scanner(System.in);
void intrest()
{
System.out.println("enter the principal amount");
p=sc.nextInt();

System.out.println("enter the rate amount");
r=sc.nextInt();

System.out.println("enter the time");
t=sc.nextInt();

a=p*(1+r*t);
System.out.println(" simple intrest is"+a);

}
void number()
{
a=5;
p=7;
r=9;
i=10;
t=3;

System.out.println("avrg of 5number is"+((a+r+t+p+i)/5));
}
}
public class average
{
public static void main(String[]args)
{
simple ab=new simple();
ab.intrest();
ab.number();
}
}
