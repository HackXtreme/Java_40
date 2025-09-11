package Unit1;

public class MyEmp
{
    //static block main sei pehle chalta hai
    //public static void main = matlab main method hmara most common example hota hai static method ka
    static {
        System.out.println("I am in static block");
        Employee.emp_info();
    }
    public static void main(String[] args) {
        Employee s1 = new Employee(12, "aneka", 2500000);
        s1.display();
        //bina object ke aise call krenge
        Employee.emp_info();
    }

}

