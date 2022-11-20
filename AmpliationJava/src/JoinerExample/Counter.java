package JoinerExample;

public class Counter extends Thread {
    public void run (){
        for (long i = 0; i<100000000; i++){}
        System.out.println(this.getName()+ " finished");
    }
}
