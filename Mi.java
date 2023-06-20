interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class Mi implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
Mi obj = new Mi();  
obj.print();  
obj.show();  
 }  
}  