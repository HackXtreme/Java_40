package Unit3;

import java.util.*;

public class ArrayList2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> product=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            product.add(sc.next());
        }
        System.out.println(product);
//we need to sort alphabetically
        Collections.sort(product);
        System.out.println(product);
        System.out.println(product.get(3));//to get product at third index
    }
}
