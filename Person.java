
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;  
    private String ID;  
    private String emailAdd;
    private String phoneNum;

    public Person()
    {
        name = "default";
        ID = "default";
        emailAdd = "default";
        phoneNum = "default";
    }
    
    public Person (String name, String ID, String email, String phone)
    {
        this.name = name;
        this.ID = ID;
        emailAdd = email;
        phoneNum = phone;   
    }
    
    public void setID(String ID)
    {
        this.ID = ID;
    }
    
    public void setEmail(String address)
    {
        emailAdd = address;
    }
    
    public void setPhoneNum(String num)
    {
        phoneNum = num;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String getEmail()
    {
        return emailAdd;
    }
    
    public String getPhoneNum()
    {
        return phoneNum;
    }
    
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("%nID: " + ID);
        System.out.println("%nE-mail Address: " + emailAdd);
        System.out.println("%nTelephone: " + phoneNum);
    }
}

