import java.io.*;
class Readbyte
{
public static void main(String args[])
{
FileInputStream infile=null;
int b;
try {
infile=new FileInputStream("city.txt");
while((b=infile.read())!=-1)
{
System.out.println((char)b);
}
infile.close();
}
catch(IOException ioe)
{
System.out.println(ioe);
}
}
}