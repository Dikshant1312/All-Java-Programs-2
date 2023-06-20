class Nestedtry 
{
public static void main(String args[])
{
try 
{
int a=10;
int b=5;
int c=5;
int x;

int p[]={2};
p[3]=33;
try 
{
x=a/(b-c);
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero");
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index is out of bounds");
}
}
}