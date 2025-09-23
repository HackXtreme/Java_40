package Unit3;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int number;
        n=sc.nextInt();
        TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            number=sc.nextInt();
            //checks frequency
            tmap.put(number, tmap.getOrDefault(number, 0) + 1);
        }
        //System.out.println(tmap);
        for (int key : tmap.keySet()) {
            System.out.println(key + " " + tmap.get(key));
        }



    }
}
