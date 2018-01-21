public class StaticInitializationBlock{
private static int x;
private static int y;
static{
System.out.println("StaticInitializationBlock1 :Default value of x ="+x);
System.out.println("StaticInitializationBlock1 :Default value of y="+y);
x=14;
y=5;
}
static {
System.out.println("StaticInitializationBlock2 :We will print the sum of x and y here");
System.out.println("x+y="+(x+y));
}
public static void main(String [] args){
new StaticInitializationBlock();
}

}