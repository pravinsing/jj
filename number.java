//WAP to print an Integer (Entered by the User)

import java.util.Scanner;
public class number
{
int a,b;
Scanner sc=new Scanner(System.in);
void integer()
{
System.out.println("enter the 1st integer");
a=sc.nextInt();


System.out.println("enter the 2nd integer");
b=sc.nextInt();
}
public static void main(String[]args)
{
number ab=new number();
ab.integer();
}
}