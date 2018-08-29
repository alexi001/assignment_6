class Animal{
void speak(String b){
System.out.println(b);
}
void speak(String b,String c){
System.out.println(b+" "+c);
}
}
class Dog extends Animal{
String b1="bull";
String c1="brown";
}
class Cat extends Animal{
String b2="Persian";
String c2="white";
}
class animalCharacteristics{
public static void main(String args[]){
Dog d=new Dog();
Cat c=new Cat();
c.speak(d.b1);
d.speak(c.b2,c.c2);
 }
}
