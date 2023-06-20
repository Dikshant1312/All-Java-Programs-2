class X implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("\t ThreadX"+i);
}
System.out.println("End of ThreadX");
}}
class RunnableTest
{
public static void main(String args[])
{
X runnable=new X();
Thread thx=new Thread(runnable);
thx.start();
System.out.println("End of Main Thread");
}} 