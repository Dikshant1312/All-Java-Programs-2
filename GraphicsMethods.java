import java.awt.*;
import java.applet.*;
public class GraphicsMethods extends Applet 
{
String s=new String();
String s1=new String();
String s2=new String();
Font f1=new Font("Courier New",Font.BOLD,20);
public void paint(Graphics ga)
{
ga.setFont(f1);
ga.setColor(Color.blue);
ga.drawString("Illustration of methods of Graphics class",200,520);
Font f2=ga.getFont();
s=f2.toString();
ga.drawString(s,5,540);
ga.setColor(Color.green);
Color col=ga.getColor();
s2=col.toString();
ga.drawString(s2,5,560);
ga.fillRect(500,15,70,90);
ga.drawRect(160,5,60,60);
ga.drawOval(10,120,155,95);
ga.setColor(Color.black);
ga.drawLine(38,100,200,180);
ga.drawArc(400,150,180,280,90,70);
int x2[]={200,120,280,240};
int z2=4,y2[]={260,370,370,270};
ga.setColor(Color.blue);
ga.fillPolygon(x2,y2,z2);
ga.setColor(Color.red);
ga.drawRect(15,15,30,50);
FontMetrics f3=ga.getFontMetrics();
s1=f3.toString();
ga.drawString(s1,5,580);
ga.setColor(Color.magenta);
ga.fillRoundRect(510,400,90,80,20,20);
}
}
