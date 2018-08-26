class Test {
    static int i;
    int j;
     
    
    static {
        i = 1001;
        System.out.println("static block is called ");
    }
    
}
 
class Main {
    public static void main(String args[]) {
 
       
        System.out.println(Test.i); 
    }
}
