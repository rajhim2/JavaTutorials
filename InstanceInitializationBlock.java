public class InstanceInitializationBlock{
private int x;
private int y;
{
System.out.println("InstanceInitializationBlock1:Default value of x="+x);
System.out.println("InitializationBlock1:Default value of y="+y);
x=5;
y=9;
}
{
System.out.println("InstanceInitializationBlock2: We will print the sum of x and y here");
System.out.println("x+y= "+(x+y));
}
public InstanceInitializationBlock(){
System.out.println("Constructor:x="+x);
System.out.println("Constructor:y="+y);
System.out.println();
}
public static void main(String [] args){
InstanceInitializationBlock t1=new InstanceInitializationBlock();
InstanceInitializationBlock t2=new InstanceInitializationBlock();
InstanceInitializationBlock t3=new InstanceInitializationBlock();
}
}