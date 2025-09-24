package Unit3;
import java.util.*;


// Maximum Frequency Word print
public class TreeMap5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
        String word;

        for(int i=0;i<n;i++) {
            word = sc.next();
            tm.put(word, tm.getOrDefault(word, 0) + 1);
        }
        int maxCount = Collections.max(tm.values());
        System.out.println("\nMost frequent word(s):");
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " times)");
            }
        }
        }
    }


