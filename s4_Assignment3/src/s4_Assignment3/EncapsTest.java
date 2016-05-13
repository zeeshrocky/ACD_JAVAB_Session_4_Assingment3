package s4_Assignment3;

public class EncapsTest{
    public static void main(String args[]){
         EncapsulationEmployee obj = new EncapsulationEmployee();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpID(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee ID: " + obj.getEmpID());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}