package Unit3;
//Sorting Student Records by Roll Number (key) student name(value)
import java.util.*;
public class TreeMap4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int rollno;
        n=sc.nextInt();
        TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
        for(int i=0;i<n;i++){
            rollno=sc.nextInt();
            String name=sc.next();

            tmap.put(rollno,name);

        }
        for(int key:tmap.keySet()){
            System.out.println(key+ " "+tmap.get(key));
        }
    }
}
