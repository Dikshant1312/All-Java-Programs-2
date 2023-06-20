class Room1
{
public static void main(String args[])
{
Room room1=new Room(25,15);
float area1=room1.area();
System.out.println("Area 1="+area1);
Room room2=new Room(20);
float area2=room2.area();
System.out.println("Area 2="+area2);
}}
class Room{
float length;
float breadth;
Room(float x,float y)
{
length=breadth=x;
}
float area()
{
return(length*breadth);
}