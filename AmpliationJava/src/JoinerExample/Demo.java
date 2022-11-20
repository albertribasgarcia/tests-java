package JoinerExample;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c[] = new Counter[200];
        for (int i = 0; i<c.length; i++){
            c[i] = new Counter();
            c[i].start();
            System.out.println(c[i].getName() + " Started");
            c[i].join();
        }
    }
}
