package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person{
    private String department;
    private float payGrade;
    private int employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayGrade() {
        return payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setPayGrade(float payGrade) {
        this.payGrade = payGrade;
    }

    @Override
    public String introduceYourSelf(){
        String firstName = getFirstName();
        String lastName = getLastName();
        return "Hi i'm "+firstName+" "+lastName+" and working in CITE";
    }
}
