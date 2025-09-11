package Unit1;

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,y,z=0;
        System.out.println("Enter any two numbers");

        try
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
        }
        /*catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        /*catch(Exception e)
        {
            System.out.println(e.getMessage());*/

        finally
        {
            System.out.println(x);
        }
    }
}
