class InheritanceSubClassStudent extends InheritanceSuperClassPerson{
private int rollNo;
private int Marks;
public void setStuDetails(int r, int m){
rollNo=r;
Marks=m;
}
public void getStuDetails(){
System.out.println("Student's Roll No = "+rollNo);
System.out.println("Student's Marks are = "+Marks);
}
}
