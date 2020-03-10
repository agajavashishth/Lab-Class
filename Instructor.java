
/**
 * Write a description of class Instructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor extends Person
{
    // instance variables - replace the example below with your own
    private String department;
    
    public Instructor()
    {
        super();
        department = "default";
    }

    public Instructor (String name, String ID, String email, String phone, String department)
    {
        super(name,ID,email,phone);
        this.department = department;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setDepartment(String department)
    {
        this.department = department;
    }
    
    public void display()
    {
        super.display();
        System.out.println("%nDepartment: " + department);
    }
}
