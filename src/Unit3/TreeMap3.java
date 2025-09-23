package Unit3;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
//character frequency counter in a word
public class TreeMap3
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
        String word;
        word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }
        tm.forEach((key,value)->System.out.println(key+" "+value));
    }
}
