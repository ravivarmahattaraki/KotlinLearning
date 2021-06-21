package kotlin_interoperable.call_java_from_kotlin;

public class MyJavaClass {
    public static void main(String[] args){

    }
    public static void add(int a,int b){
        int result = a + b;
        System.out.println("printing inside Java class :"+result);
    }

    public void display(){
        System.out.println("I am JAVA");
    }
}
