public class ConstructorConcept{
private int l,b,h;
//public ConstructorConcept(){}       ------>>> This is a default constructor which is made by the compiler when we don't make our own Constructor.
public ConstructorConcept(){
l=6;b=3;h=2;
}
public ConstructorConcept(int L,int B, int H){
l=L;b=B;h=H;
}
public void showDimension(){
System.out.println("Length of Box="+l);
System.out.println("Breadth of Box="+b);
System.out.println("Height of Box="+h);
}
public static void main(String args[]){
ConstructorConcept c1=new ConstructorConcept();
ConstructorConcept c2=new ConstructorConcept();
c1.showDimension();
c2.showDimension();
}
}