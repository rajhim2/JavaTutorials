public class InheritanceConcept{
public static void main(String [] args){
InheritanceSubClassStudent i1 = new  InheritanceSubClassStudent();
i1.setName("Himanshu Raj");
i1.setAge(20);
i1.setStuDetails(2432,92);
System.out.println("Name =>"+i1.getName());
System.out.println("Age =>"+i1.getAge());
i1.getStuDetails();
}
}