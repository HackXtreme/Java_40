package Unit1;

//step 1 - user defined exception
public class InvalidAgeException  extends Exception {
    public InvalidAgeException(String message)
    {
        //step 2
        super(message);
    }
}
