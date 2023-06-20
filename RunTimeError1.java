class RunTimeError1
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=5;
int x;
try
{
x=a/(b-c);
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero");
}
int y=a/(b+c);
System.out.println("y="+y);
}
}