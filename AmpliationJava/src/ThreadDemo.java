
public class ThreadDemo extends Thread {
    public void run(){
        System.out.println("Run Thread "+ this);
    }
    public static void main(String args[]){
        ThreadDemo t = new ThreadDemo();
        t.start();
    }
}
