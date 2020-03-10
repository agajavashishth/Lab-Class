
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Student extends Person
{
    private int credits;
    
    public Student()
    {
        super();
        credits = 0;
    }

    public Student(String fullName, String studentID, String studentEmail, String studentPhone)
    {
        super(fullName,studentID,studentEmail,studentPhone);
        credits = 0;
    }
   
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    public int getCredits()
    {
        return credits;
    }

    public String getLoginName()
    {
        String loginName = getName().substring(0,4) + getID().substring(0,3);
        return loginName;
    }
    
    public void display()
    {
        super.display();
        System.out.println("%nCredits: " + credits);
        System.out.println("%nLogin Name: " + getLoginName());
    }
}
