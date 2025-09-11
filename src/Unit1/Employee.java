package Unit1;

public class Employee
{
    int emp_id;
    String emp_name;
    double emp_salary;
    static String emp_org="Google";
    public Employee(int emp_id, String emp_name, double emp_salary)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public void display()
    {
        System.out.println("EMP ID:"+emp_id);
        System.out.println("EMP name"+emp_name);
        System.out.println("EMP salary"+emp_salary);
    }
    //agar hmne method ko static kr diya so without making object we can access
    public static void emp_info()
    {
        System.out.println(emp_org);
    }
}
//static block main sei pehle hi execute hoga!!
//static method ke andhar non static variables not allowed
//static class can only be made in nested class