interface ItemConstants
{
int code=1001;
String name="Fan";
}
interface ItemMethods extends ItemConstants
{
void display();
}
class Item implements ItemMethods
{
public void display()
{
System.out.println("interface is implemented");
}
public static void main(String args[])
{
Item i=new Item();
ItemMethods im;
im=i;
im.display();
}
}