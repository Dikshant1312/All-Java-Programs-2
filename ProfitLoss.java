import java.io.*;
  
public class ProfitLoss{
public static void main(String args[])throws IOException{
int cp,sp,p,l;
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the CP:");
cp=Integer.parseInt(in.readLine());
System.out.println("Enter the SP");
sp=Integer.parseInt(in.readLine());
if(sp>cp){
p=(sp-cp)*(100/cp);
System.out.println("profit percent:"+p);
}
else if(cp>sp){
l=(cp-sp)*(100/cp);
System.out.println("loss percent:"+l);
}
}
}





















