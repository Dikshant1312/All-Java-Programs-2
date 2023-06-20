class add 
{
int ad(int a,int b)
{
return a+b;
}
}
public class MethodOverloading
{
public static void main(String args[]){
add r=new add();
int g=r.ad(54,14);
System.out.println("The sum :"+g);
}
}
