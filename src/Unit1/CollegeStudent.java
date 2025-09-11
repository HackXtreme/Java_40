package Unit1;

public class CollegeStudent extends Student1
{
    public int roll_no;
    public CollegeStudent(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_rollno()
    {
        System.out.println("Roll no is "+roll_no);
    }
}
