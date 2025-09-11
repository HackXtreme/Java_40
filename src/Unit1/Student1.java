package Unit1;

public class Student1
{
    protected String address;

    public Student1(String address)//constructor ko intialize kr rhe
    {
        this.address=address;
    }
    public void show_address()
    {
        System.out.println("Address is "+address);
    }
}
