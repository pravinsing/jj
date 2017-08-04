//WAP to calculate the area of Square.
//WAP to calculate the perimeter and area of Rectangle
//WAP to calculate the area of Circle


import java.util.Scanner;
class area
{
int r,a,l,w,d;
Scanner sc=new Scanner(System.in);
void circle()
{
System.out.println("enter radious");
r=sc.nextInt();

System.out.println("area of circle is"+(3.14*r*r));
} 

void square()
{

System.out.println("enter side");
a=sc.nextInt();

System.out.println("area of square is"+(a*a));
} 
void perimeter()
{
System.out.println("enter the length");
l=sc.nextInt();

System.out.println("enter the width");
w=sc.nextInt();
d=l+w;
System.out.println("perimeter is"+2*d);
}
void rectangle()
{
System.out.println("area of rectagle is"+l*w);
}


}
public class area1
{
public static void main(String[]args)
{
area ab=new area();
ab.square();
ab.circle();
ab.perimeter();
ab.rectangle();
}
}
