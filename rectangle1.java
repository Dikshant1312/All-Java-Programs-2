class rectangle
{
void area(int l,int b)
{
int a=l*b;
System.out.println("Area of a rectangle="+a);
}
void area1(int a,int c)
{
int x=a*c;
System.out.println("Area of rectangle="+x);
}
}
class rectangle1
{
public static void main(String args[])
{
rectangle r=new rectangle();
r.area(2,3);
r.area(4,5);
}
}