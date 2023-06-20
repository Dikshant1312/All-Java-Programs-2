class demo
{
void compute()
{
System.out.println("Hello");
}
void compute(int a,int b)
{
int c=a+b;
System.out.println("Sum="+c);
}
void compute(double a)
{
System.out.println(a);
}
}
class main
{
public static void main(String args[])
{
demo object=new demo();
object.compute();
object.compute(10,15);
object.compute(4);
}
}