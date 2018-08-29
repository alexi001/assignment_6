abstract class vehicle{
abstract void  start();
void stop(){
System.out.println("Vehicle has stopped");
}
}

class twoWheeler extends vehicle{
void start(){
System.out.println("Two wheeler has started");
}
void stop(){
System.out.println("Two wheeler has stopped");
}
}
class fourWheeler extends vehicle{
void start(){
System.out.println("Four wheeler has started");
}
void stop(){
System.out.println("Four wheeler has stopped");
}
}
class abstractVehicle{
public static void main(String args[]){
vehicle obj=new fourWheeler();
vehicle obj1=new twoWheeler();
obj.start();
obj.stop();
obj1.start();
obj1.stop();
 }
}
