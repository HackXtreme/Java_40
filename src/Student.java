import java.util.*;
public class Student {
    int roll_no;
    public String name;
    private String banking_password;
    Student(int r,String n)
    {
        name=n;
        roll_no=r;
    }
    void display()
    {
        System.out.println("roll no is "+roll_no);
        System.out.println("name is "+name);
    }

}

