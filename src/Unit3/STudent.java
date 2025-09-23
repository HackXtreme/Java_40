package Unit3;

import java.util.Comparator;

public class STudent implements Comparable<STudent>
{
    int age;
    String name;
    int roll_no;
    public int compareTo(STudent st) {
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }
}
