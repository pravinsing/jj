//WAP to calculate the addition of 2 numbers.
//WAP to calculate the multiplication of three numbers.

import java.util.Scanner;
 class airthmatic
{
Scanner sc=new Scanner(System.in);
int a,b,d;

void add()
{

System.out.println("enter the 1st number");
a=sc.nextInt();

System.out.println("enter the 2nd number");
b=sc.nextInt();

System.out.println("addition is" + (a+b));

}

void mul()
{
System.out.println("enter 1st the number");
a=sc.nextInt();

System.out.println("enter the 2nd number");
b=sc.nextInt();

System.out.println("enter the number");
d=sc.nextInt();
System.out.println("multiplication is" +(a*b*d));
}
}
public class arth
{
public static void main(String[]args)
{
airthmatic ab=new airthmatic();
ab.add();
ab.mul();
}
}
