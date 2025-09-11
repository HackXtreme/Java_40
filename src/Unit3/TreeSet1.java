package Unit3;
import java.util.*;
public class TreeSet1
{
    public static void main(String[] args) {
        SortedSet<Integer> ts=new TreeSet<>();
        System.out.println("Enter the number of Elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ts.add(sc.nextInt());
        }
        System.out.println(ts);
        System.out.println(ts.subSet(2,5));//values sei baat hoti hai matlab 2 sei big include nd 5 sei kam exclude
    }
}
