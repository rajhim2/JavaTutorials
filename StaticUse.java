class Example{
int x;
static int z;
private static int y;
public void fun1()
{
x=3;
System.out.println(x);
}
public static void fun2()
{
y=4;
System.out.println(y);
}
static class Test{
public static String country="India";
}
}
public class StaticUse{
public static void main(String[] args)
{
Example ex1=new Example();
ex1.fun1();
ex1.x=9;
System.out.println(ex1.x);
Example.z=7;
System.out.println(Example.z);
Example.fun2();
System.out.println(Example.Test.country);
}
}