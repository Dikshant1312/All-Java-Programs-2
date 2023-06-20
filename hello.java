class Room 
{
int len;
int breadth;
Room(int x,int y)
{
len=x;
breadth=y;
}
int area()
{
return(len*breadth);
}
}
class BedRoom extends Room
{
int height;
BedRoom(int x,int y,int z)
{
super(x,y);
height=z;
}
int volume()
{
return (len*breadth*height);
}
}
class hello
{
public static void main(String args[])
{
BedRoom r1=new BedRoom(20,30,40);
int a1=r1.area();
int v1=r1.volume();
System.out.println("Area="+a1);
System.out.println("Volume="+v1);
}
}