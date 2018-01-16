class Box{
private int length ,breadth,height;
public void setDimension(int l,int b,int h){
length=l;
breadth=b;
height=h;
}
public void showDimension(){
System.out.println("L="+length);
System.out.println("B="+breadth);
System.out.println("H="+height);
}}
class ClassConcept{
public static void main(String[] args){
Box smallBox=new Box();
smallBox.setDimension(12,10,6);
smallBox.showDimension();
}
}