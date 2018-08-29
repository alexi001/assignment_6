class demo{
void printIt(Integer x){
System.out.println("Integer  null passed" );
}
void printIt(Float a){
System.out.println("Float  null passed");
}
}
class nullOverload {
public static void main(String args[]){
demo obj=new demo();
Integer a=null;
Float b=null;


obj.printIt(a);
obj.printIt(b);
 }
}
