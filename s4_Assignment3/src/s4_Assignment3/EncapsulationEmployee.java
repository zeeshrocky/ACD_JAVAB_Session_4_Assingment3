package s4_Assignment3;

public class EncapsulationEmployee {

	private int id;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpID(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpID(int newValue){
        id = newValue;
    }
}
