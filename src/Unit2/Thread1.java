package Unit2;
//ye child thread hai we need to make Main thread
//1 se 10 tak number print krna hai
public class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("thread 1 " + i);
                Thread.sleep(10000);//har output 10 10 sec ke interval mei aayega
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
