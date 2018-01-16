public class Wrapper{
public static void main(String[] args){
Integer i1=Integer.valueOf("123");
Integer i2=Integer.valueOf("1101101",2);
Double d1=Double.valueOf("12.44");
int a=Integer.parseInt("299");
double b=Double.parseDouble("3.23");
int c=i1.intValue();
int d=i2.intValue();
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
}
}