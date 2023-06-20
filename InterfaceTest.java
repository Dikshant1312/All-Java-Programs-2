interface Area 
{
final static float pi=3.14F;
float compute(float x,float y);
}
class Rectangle implements Area 
{
public float compute(float x,float y)
{
return(x*y);
}
}
class Circle implements Area 
{
public float compute(float x,float y)
{
return(pi*x*x);
}
}
class InterfaceTest
{
public static void main(String args[])
{
Rectangle rect=new Rectangle();
Circle cir=new Circle();
Area a;
a=rect;
System.out.println("Area of Rect"+a.compute(10,20));
a=cir;
System.out.println("Area of Cir"+a.compute(10,0));
}
}