//WAP to calculate the increment of a given number by 1
//WAP to calculate the increment of a given number by 7

import java.util.Scanner;
public class calculate
{
Scanner sc=new Scanner(System.in);
int a;

void incone()
{

System.out.println("enter the number");
a=sc.nextInt();

System.out.println("increment by one" + (a+1));

}

void incseven()
{
System.out.println("enter the number");
a=sc.nextInt();
System.out.println("increment by seven" +(a+7));
}
public static void main(String[]args)
{
calculate ab=new calculate();
ab.incone();
ab.incseven();
}
}
