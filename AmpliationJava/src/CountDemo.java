
public class CountDemo extends Thread {
    CountDemo(){
        super();
        System.out.println("Creating thread " + this);
        start();
    }
    public void run(){
        try {
            for(int i=0; i<20; i++){
                System.out.println("Printing the count "+ i);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread "+ this + " interrupted");
        }
        System.out.println("Thread "+ this + " finished");
    }
}

class Testing {
    public static void main(String[] args) {
        CountDemo cd = new CountDemo();
        System.out.println("before try");

        try {
            cd.join();
            System.out.println("before while");
            while (cd.isAlive()) {
                Thread.sleep(1);
                System.out.println("while");
            }
        } catch (InterruptedException e){
            System.err.println("Main Thread interrupted");
        }
        System.out.println("Main over");
    }
}
