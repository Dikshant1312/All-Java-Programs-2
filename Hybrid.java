class Student
{
int rollno;
void getNumber(int n)
{
rollno=n;
}
void putNumber()
{
System.out.println("Rollno:"+rollno);
}
}
class Test extends Student
{
float P1,P2;
void getMarks(float m1,float m2)
{
P1=m1;
P2=m2;
}
void putMarks()
{
System.out.println("Marks Obtained");
System.out.println("Part1:"+P1);
System.out.println("Part2:"+P2);
}
}
interface Sports
{
float sportWt=6.0F;
void putWt();
}
class Results extends Test implements Sports
{
float total;
public void putWt()
{
System.out.println("Sports Wt="+sportWt);
}
void display()
{
total=P1+P2+sportWt;
putNumber();
putMarks();
putWt();
System.out.println("Total Score:"+total);
}
}
class Hybrid
{
public static void main(String args[])
{
Results s1=new Results();
s1.getNumber(1234);
s1.getMarks(27.5F,33.0F);
s1.display();
}
}

