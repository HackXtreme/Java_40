package Unit3;
import java.util.*;
public class LinkedList1
{
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ll1.add(sc.nextInt());
        }
        Iterator itr=ll1.descendingIterator();
        //normal iterator- start sei
        //descendingIterator: last sei chalege
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Collections.sort(ll1);
        System.out.println(ll1);
        System.out.println("Min" +ll1.getFirst());
        System.out.println("Max" +ll1.getLast());
    }
}
