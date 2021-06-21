package kotlin_interoperable.call_kotlin_from_java;

public class MyJavaClassOne {
    public static void main(String[] args) {
        int area = MyKotlinFileOneKt.area(4,5);
        System.out.println("printing area inside Java class returning from Kotlin file: "+area);

        MyKotlinClassOne myJavaClassOne = new MyKotlinClassOne();
        myJavaClassOne.display();
    }
}
