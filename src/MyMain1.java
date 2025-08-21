public class MyMain1
{
    public static void main(String[] args) {
        CollegeStudent c1=new CollegeStudent("ghaziabad",40);
        c1.show_rollno();
        c1.show_address();

        c1.address="Rampur";
        System.out.println("New address is ");
        c1.show_address();

    }
}
