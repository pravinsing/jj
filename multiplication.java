//WAP  to Multiply two Floating Point Numbers

import java.util.Scanner;
class point
{
float a;
Scanner sc=new Scanner(System.in);
void mul()
{
System.out.println("enter the float number");
a=sc.nextFloat();
System.out.println("floating point multiplication of 2 number is"+(a*0.5));
}
}
public class multiplication
{
public static void main(String[]args)
{
point ab=new point();
ab.mul();
}
}