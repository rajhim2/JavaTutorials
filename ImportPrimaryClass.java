package pack1;
import pack2.*; 
//If we want to import all the classes then we will simply write
//  import pack2.* ; (Use ASTERISK)
public class ImportPrimaryClass{
public static void main(String[] args){
ImportSecondaryClass i1=new ImportSecondaryClass();
i1.setName("Himanshu Raj");
i1.setRoll(23444536);
System.out.println("From NIT Srinagar ---->>> "+i1.getName());
System.out.println("His Roll No is  ------>>> "+i1.getRoll());
}
}